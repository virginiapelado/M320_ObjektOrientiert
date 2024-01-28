import React from "react";
import { Category } from "../../Service/Category";
import { Movie } from "../../Service/Movie";

export default function GenreDisplay({ movie }: { movie: Movie }) {
  const containerStyle = {
    border: "2px solid #D17B34",
    borderRadius: "5px",
    padding: "10px",
    backgroundColor: "#D17B34",
    color: "white",
  };

  return <div style={containerStyle}>{movie.movieCategory.category}</div>;
}
