import { useState } from "react";
import { MovieQuiz } from "../../Service/MovieQuiz";
import QuestionCard from "../Atoms/QuestionCard";

export default function MoviesCard() {
    const [quizDetails] = useState<MovieQuiz[]>([]);

    return (
        <div>
          {quizDetails?.map((item) => {
            return (
              <div>
                <QuestionCard
                  id={item.id}
                  question={item.question}
                  answerA={item.answerA}
                  answerB={item.answerB}
                  answerC={item.answerC}
                  answerD={item.answerD}
                  answerE={item.answerE}
                  chosenAnswer={item.chosenAnswer}
                  category={item.category}
                  recommendedMovie={item.recommendedMovie}
                />
              </div>
            );
          })}
        </div>
      );
    }
    