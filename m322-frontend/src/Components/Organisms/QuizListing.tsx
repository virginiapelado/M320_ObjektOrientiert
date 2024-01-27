import React, { useEffect, useState } from "react";
import { Quiz } from "../Service/Quiz";
import QuizService from "../Service/QuizService";
import QuizQuestion from "../Atoms/QuizQuestion";
import QuizPrompts from "../Molecules/QuizPrompts";

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
    // Implement the logic to store the selected answer for each question
    console.log(`Question ID: ${questionId}, Selected Answer: ${answer}`);
  };

  return (
    <div>
      {quizDetails?.map((quiz) => (
        <div key={quiz.id}>
          <QuizQuestion
            question={quiz.question}
            answerA={quiz.answerA}
            answerB={quiz.answerB}
            answerC={quiz.answerC}
            answerD={quiz.answerD}
            answerE={quiz.answerE} id={quiz.id} />
          <br />
          <QuizPrompts prompt={quiz} onSelectAnswer={handleSelectAnswer} />
        </div>
      ))}
    </div>
  );
}
