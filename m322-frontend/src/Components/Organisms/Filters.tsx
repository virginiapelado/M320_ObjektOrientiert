import React from "react";
import GenreButton from "../Atoms/GenreButton";
import LengthButton from "../Atoms/LengthButton";
import RatingButton from "../Atoms/RatingButton";

export default function Filters() {
  return (
    <div style={{ display: "flex", gap: 34 }}>
      <GenreButton />
      <LengthButton />
      <RatingButton />
    </div>
  );
}
