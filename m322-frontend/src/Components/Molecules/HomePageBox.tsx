import React from "react";
import { Link } from "react-router-dom";
import RectangleCard from "../Atoms/RectangleCard";

export default function HomePageBox() {
  return ( <div className="homepage-box">
  <RectangleCard />
  <div className="content">
    <img src="../../img/spider-man-logo.png" alt="Logo" className="logo" />
    <p className="text">Your text goes here.</p>
  </div>
</div>
  );
}
