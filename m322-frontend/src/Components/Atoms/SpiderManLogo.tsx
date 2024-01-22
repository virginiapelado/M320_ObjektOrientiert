import React from "react";
import logo from "../../img/spider-man-logo.png"
import { Link } from "react-router-dom";

//TODO: route the button to the films page

export default function SpiderManLogo() {
  return (
    <Link to="/*" style={{ textDecoration: "none" }}>
      <img src={logo} alt="Logo" className="spiderman-logo" />
    </Link>
  );
}