import React, { ChangeEvent } from "react";
import { useFormik } from "formik";
import * as Yup from "yup";
import { Quiz } from "../Service/Quiz";

interface QuizPromptsProps {
  prompt: Quiz;
  onAnswerChange: (selectedAnswer: string) => void;
}

export default function QuizPrompts({ prompt, onAnswerChange }: QuizPromptsProps) {
  const formik = useFormik({
    initialValues: {
      selectedAnswer: "",
    },
    validationSchema: Yup.object({
      selectedAnswer: Yup.string().required("Please select an answer"),
    }),
    onSubmit: () => {
      // Submit button is in QuizListing
    },
  });

  const handleAnswerChange = (event: ChangeEvent<HTMLInputElement>) => {
    formik.handleChange(event);
    onAnswerChange(event.target.value);
  };

  return (
    <div>
      <div id="A">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerA}
          onChange={handleAnswerChange}
          checked={formik.values.selectedAnswer === prompt.answerA}
        />
        {prompt.answerA}
      </div>
      <div id="B">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerB}
          onChange={handleAnswerChange}
          checked={formik.values.selectedAnswer === prompt.answerB}
        />
        {prompt.answerB}
      </div>
      <div id="C">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerC}
          onChange={handleAnswerChange}
          checked={formik.values.selectedAnswer === prompt.answerC}
        />
        {prompt.answerC}
      </div>
      <div id="D">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerD}
          onChange={handleAnswerChange}
          checked={formik.values.selectedAnswer === prompt.answerD}
        />
        {prompt.answerD}
      </div>
      <div id="E">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerE}
          onChange={handleAnswerChange}
          checked={formik.values.selectedAnswer === prompt.answerE}
        />
        {prompt.answerE}
      </div>
    </div>
  );
}
