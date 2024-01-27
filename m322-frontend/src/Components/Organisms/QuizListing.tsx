import { useEffect, useState } from "react";
import { Quiz } from "../Service/Quiz";
import QuizService from "../Service/QuizService";
import QuizQuestion from "../Atoms/QuizQuestion";
import QuizPrompts from "../Molecules/QuizPrompts";
import { useFormik } from "formik";
import * as Yup from "yup";

export default function QuizListing() {
  const [quizDetails, setQuizDetails] = useState<Quiz[]>([]);
  const [selectedAnswers, setSelectedAnswers] = useState<string[]>([]);

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

  const handleAnswerChange = (index: number, selectedAnswer: string) => {
    const updatedAnswers = [...selectedAnswers];
    updatedAnswers[index] = selectedAnswer;
    setSelectedAnswers(updatedAnswers);
  };

  const handleFormSubmit = () => {
    // Handle form submission logic here using selectedAnswers
    console.log("Selected Answers:", selectedAnswers);
  };

  return (
    <div>
      {quizDetails?.map((quiz, index) => (
        <div key={index}>
          <QuizQuestion
            question={quiz.question}
            answerA={quiz.answerA}
            answerB={quiz.answerB}
            answerC={quiz.answerC}
            answerD={quiz.answerD}
            answerE={quiz.answerE}
          />{" "}
          <br />
          <QuizPrompts
            prompt={quiz}
            onAnswerChange={(selectedAnswer) =>
              handleAnswerChange(index, selectedAnswer)
            }
          />
        </div>
      ))}
      <div>
        <button type="button" onClick={handleFormSubmit}>
          Submit
        </button>
      </div>
    </div>
  );
}
