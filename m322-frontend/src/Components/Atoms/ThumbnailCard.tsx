import React from "react";
import "./style.css";
import { Movie } from "../../Service/Movie";

export default function ThumbnailCard(movie: Movie) {
  return (
    <div className="image">
      <img
        className="thumbnail-card"
        alt="Thumbnail card"
        src={movie.thumbnail}
      />
    </div>
  );
}
