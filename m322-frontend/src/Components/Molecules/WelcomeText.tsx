import React from "react";
import logo2 from "../../img/Logo2.png";
import "./style.css";

export default function WelcomeText() {

  return (
    <div className="welcometxt">
      <h1 style={{marginRight: '2%'}}>Welcome to</h1> <img src={logo2} alt="logo" />
    </div>
  );
}
