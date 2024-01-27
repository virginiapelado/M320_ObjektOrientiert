import { Button } from "@mui/material";
import React, { useState } from "react";
import { Quiz } from "../Service/Quiz";

export default function QuizSubmitButton() {
  const [quizDetails, setQuizDetails] = useState<Quiz>();

  const submitQuiz = () => {
  }

  return (
    <Button variant="contained" id="quiz-button">Find my quiz!</Button>
  );
}
