import Header from "../Organisms/Header";
import QuizListing from "../Organisms/QuizListing";
import "./style.css";

export default function QuizPage() {
  return (
    <div style={{ height: "100vh", overflow: "scroll", overflowX: "hidden" }}>
      <Header />
      <div>
        <div className="quiz-text">
          Don't know what to watch? <br />
          Take this short quiz and get a recommendation from us!
        </div>
        <div className="quiz-container">
          <QuizListing />
        </div>
      </div>
    </div>
  );
}
