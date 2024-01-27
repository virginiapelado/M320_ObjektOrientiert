import React from "react";
import { Quiz } from "../Service/Quiz";
import { useFormik } from "formik";
import * as Yup from "yup";

export default function QuizQuestion(quiz : Quiz) {
  return (
    <div>
        {quiz.question}
    </div>
  );
}
