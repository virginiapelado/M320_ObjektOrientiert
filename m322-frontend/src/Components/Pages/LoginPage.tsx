import Header from "../Organisms/Header";
import LoginImage from "../Atoms/LoginImage";
import WelcomeText from "../Molecules/WelcomeText";
import "./style.css";

export default function LoginPage() {
  return ( <div>
    <Header />
    <div className="split-layout">
      <div className="left-half">
        <div className="welcome">
        <WelcomeText />
        </div>
        <p className="txt">Welcome or welcome back! <br />
         Whether you're a new or returning user, log in here.</p>
      </div>
      <div className="right-half">
        <LoginImage />
      </div>
    </div>
    </div>
  );
}
