import React from "react";
import logo from "../../img/Logo.png";
import "./style.css";
import { Link } from "react-router-dom";

export default function Logo() {
  return (
    <Link to="/home" style={{ textDecoration: "none" }}>
    <div className="logo">
      <img src={logo} alt="Logo" />
    </div>
    </Link>
  );
}
