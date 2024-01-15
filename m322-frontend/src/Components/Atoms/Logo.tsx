import React from "react";
import logo from "../../img/Logo.png";
import "./style.css";

export default function Logo() {
  return (
    <div className="logo">
      <img src={logo} alt="Logo" />
    </div>
  );
}
