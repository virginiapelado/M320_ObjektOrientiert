import React, { ChangeEvent, useState } from "react";
import { Quiz } from "../Service/Quiz";

export default function QuizPrompt({ prompt }: { prompt: Quiz }) {
  const [selectedAnswer, setSelectedAnswer] = useState<string | null>(null);

  const handleAnswerChange = (event: ChangeEvent<HTMLInputElement>) => {
    setSelectedAnswer(event.target.value);
  };

  return (
    <div>
      <div id="A">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerA}
          onChange={handleAnswerChange}
          checked={selectedAnswer === prompt.answerA}
        />
        {prompt.answerA}
      </div>
      <div id="B">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerB}
          onChange={handleAnswerChange}
          checked={selectedAnswer === prompt.answerB}
        />
        {prompt.answerB}
      </div>
      <div id="C">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerC}
          onChange={handleAnswerChange}
          checked={selectedAnswer === prompt.answerC}
        />
        {prompt.answerC}
      </div>
      <div id="D">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerD}
          onChange={handleAnswerChange}
          checked={selectedAnswer === prompt.answerD}
        />
        {prompt.answerD}
      </div>
      <div id="E">
        <input
          type="radio"
          name="quizRadio"
          value={prompt.answerE}
          onChange={handleAnswerChange}
          checked={selectedAnswer === prompt.answerE}
        />
        {prompt.answerE}
      </div>
    </div>
  );
}
