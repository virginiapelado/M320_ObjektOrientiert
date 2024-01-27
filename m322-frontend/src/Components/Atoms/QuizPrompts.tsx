import React, { ChangeEvent, useState } from "react";
import { Quiz } from "../Service/Quiz";

export default function QuizPrompt(prompt : Quiz) {
  const [selectedAnswer, setSelectedAnswer] = useState<string | null>(null);

  const handleAnswerChange = (event: ChangeEvent<HTMLInputElement>) => {
    setSelectedAnswer(event.target.value);
  };

  return (
    <div>
      <div id="A">
        <input
          type="radio"
          value={prompt.answerA}
          checked={selectedAnswer === "action"}
          onChange={handleAnswerChange}
        />
        Action
      </div>
      <div id="B">
        <input
          type="radio"
          value={prompt.answerB}
          checked={selectedAnswer === "action"}
          onChange={handleAnswerChange}
        />
        Action
      </div>
      <div id="C">
        <input
          type="radio"
          value={prompt.answerC}
          checked={selectedAnswer === "action"}
          onChange={handleAnswerChange}
        />
        Action
      </div>
      <div id="D">
        <input
          type="radio"
          value={prompt.answerD}
          checked={selectedAnswer === "action"}
          onChange={handleAnswerChange}
        />
        Action
      </div>
      <div id="E">
        <input
          type="radio"
          value={prompt.answerE}
          checked={selectedAnswer === "action"}
          onChange={handleAnswerChange}
        />
        Action
      </div>
    </div>
  );
}
