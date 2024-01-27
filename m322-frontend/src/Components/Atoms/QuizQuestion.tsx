import React from "react";
import { Quiz } from "../../Service/Quiz";

export default function QuizQuestion(quiz : Quiz) {
  return (
    <div>
        {quiz.question}
    </div>
  );
}
