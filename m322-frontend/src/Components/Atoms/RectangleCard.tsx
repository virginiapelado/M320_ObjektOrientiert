import React from "react";
import "./style.css";
import SpiderManLogo from "./SpiderManLogo";

export default function RectangleCard() {
  return (
    <div className="rectangle">
      <SpiderManLogo />
      <div className="content">
        <p className="text">Miles Morales catapults across the multiverse, where he encounters a team of Spider-People charged with protecting its very existence. When the heroes clash on how to handle a new threat, Miles must redefine what it means to be a hero.</p>
      </div>
    </div>
  );
}
