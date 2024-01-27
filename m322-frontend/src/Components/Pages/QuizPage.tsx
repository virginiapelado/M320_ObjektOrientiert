import Header from "../Organisms/Header";
import QuizListing from "../Organisms/QuizListing";

export default function QuizPage() {
    return (
      <div className="quiz-page">
        <Header />
        <div>
            <p>Don't know what to watch? <br/>
           Take this short quiz and get a recommendation from us!</p>
        </div>
        <QuizListing /> 
      </div>
    );
  }