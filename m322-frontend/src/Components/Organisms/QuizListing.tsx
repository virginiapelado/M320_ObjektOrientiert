import { useEffect, useState } from "react";
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
  });

  return (
    <div>
      {quizDetails?.map((quiz) => (
        <div> <QuizQuestion question={quiz.question} answerA={quiz.answerA} answerB={quiz.answerB} answerC={quiz.answerC} answerD={quiz.answerD} answerE={quiz.answerE} /> <br />
        <QuizPrompts prompt={quiz} /> </div>
      ))}
    </div>
  );
}
