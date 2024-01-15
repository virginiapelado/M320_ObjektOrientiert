import React from "react";
import "./style.css";
import ThumbnailCard from "../Atoms/ThumbnailCard";

export const FilmPlaceholders = (): JSX.Element => {
  return (
    <div className="film-placeholders">
      <ThumbnailCard />
      <ThumbnailCard />
      <ThumbnailCard />
      <ThumbnailCard />
      <ThumbnailCard />
    </div>
  );
};
