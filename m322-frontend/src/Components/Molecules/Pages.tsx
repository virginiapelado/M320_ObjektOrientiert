import React from "react";
import HomeButton from "../Atoms/HomeButton";
import ExploreButton from "../Atoms/ExploreButton";
import QuizButton from "../Atoms/QuizButton";

export default function Pages() {
  return (
    <div style={{ display: "flex", gap: "80px" }}>
      <HomeButton />
      <ExploreButton />
      <QuizButton />
    </div>
  );
}
