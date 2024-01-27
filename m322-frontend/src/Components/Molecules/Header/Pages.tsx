import React from "react";
import HomeButton from "../../Atoms/Header/HomeButton";
import ExploreButton from "../../Atoms/Header/ExploreButton";
import QuizButton from "../../Atoms/Header/QuizButton";

export default function Pages() {
  return (
    <div style={{ display: "flex", gap: "40px" }}>
      <HomeButton />
      <ExploreButton />
      <QuizButton />
    </div>
  );
}
