import React from "react";
import "./style.css";
import { Movie } from "../../Service/Movie";
import { Link } from "react-router-dom";

export default function ThumbnailCard(movie: Movie) {
  return (
    <div className="image">
      <Link to={`/explore/${movie.id}`}>
        <img
          className="thumbnail-card"
          alt="Thumbnail card"
          src={movie.thumbnail}
        />
      </Link>
    </div>
  );
}
