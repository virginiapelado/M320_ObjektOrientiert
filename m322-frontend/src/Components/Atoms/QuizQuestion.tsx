import React, { useState, ChangeEvent } from 'react';

export default function QuizQuestion() {

    const [selectedAnswer, setSelectedAnswer] = useState<string | null>(null);

    const handleAnswerChange = (event: ChangeEvent<HTMLInputElement>) => {
        setSelectedAnswer(event.target.value);
    };

    return(
    <div className="question-container">
        <div className="question-box">
        <p>What is your favorite movie genre?</p>
            <form>
                <div>
                    <label>
                        <input
                            type="radio"
                            value="action"
                            checked={selectedAnswer === 'action'}
                            onChange={handleAnswerChange}
                        />
                        Action
                    </label>
                </div>
                <div>
                    <label>
                        <input
                            type="radio"
                            value="comedy"
                            checked={selectedAnswer === 'comedy'}
                            onChange={handleAnswerChange}
                        />
                        Comedy
                    </label>
                </div>
                <div>
                    <label>
                        <input
                            type="radio"
                            value="drama"
                            checked={selectedAnswer === 'drama'}
                            onChange={handleAnswerChange}
                        />
                        Drama
                    </label>
                </div>
            </form>
        </div>
    </div>    
    )
        

}