import QuizQuestion from "../Atoms/QuizQuestion";
import Header from "../Organisms/Header";

export default function QuizPage() {
    return (
      <div className="quiz-page">
        <Header />
        <div className="quiz-introduction">
            <p>Don't know what to watch? <br/>
           Take this short quiz and get a recommendation from us!</p>
        </div>
        <QuizQuestion />
      </div>
    );
  }