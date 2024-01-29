import React, { useEffect, useState } from "react";
import { Quiz } from "../../Service/Quiz";
import QuizService from "../../Service/QuizService";
import QuizPrompts from "../Molecules/QuizPrompts";
import { Formik, Form, Field, ErrorMessage } from "formik";

const initialValues = {}; // Initialize empty values for each question

export default function QuizListing() {
  const [quizDetails, setQuizDetails] = useState<Quiz[]>([]);

  useEffect(() => {
    const fetchQuizDetails = async () => {
      try {
        const fetchedQuizDetails = await QuizService().getMovie();
        setQuizDetails(fetchedQuizDetails);
      } catch (error) {
        console.error("Error fetching quiz details", error);
      }
    };

    fetchQuizDetails();
  }, []);

  const handleSelectAnswer = (questionId: string, answer: string) => {
    console.log(`Question ID: ${questionId}, Selected Answer: ${answer}`);
  };

  const handleSubmit = (values: any) => {
    // Implement the logic to submit and record the answers
    console.log("Submitted answers:", values);
  };

  const validate = (values: any) => {
    const errors: any = {};

    // Check if any question is unanswered
    quizDetails.forEach((quiz) => {
      const answer = values.answers && values.answers[quiz.id];
      if (!answer) {
        errors.answers = errors.answers || {};
        errors.answers[quiz.id] = "Required";
      }
    });

    // Set a general error message if any question is unanswered
    if (Object.keys(errors.answers || {}).length > 0) {
      errors._global = "Please answer all the questions!";
    }

    return errors;
  };

  return (
    <div>
      <Formik
        initialValues={initialValues}
        onSubmit={handleSubmit}
        validate={validate}
      >
        <Form>
          {quizDetails?.map((quiz) => (
            <div key={quiz.id}>
              <QuizPrompts prompt={quiz} onSelectAnswer={handleSelectAnswer} />
              <Field type="hidden" name={`answers.${quiz.id}`} />
              <ErrorMessage
                name={`answers.${quiz.id}`}
                component="div"
                className="error"
              />
              <br />
            </div>
          ))}
          <ErrorMessage name="_global" component="div" className="error" />
          <br />
          <button type="submit">Submit Answers</button>
        </Form>
      </Formik>
    </div>
  );
}
