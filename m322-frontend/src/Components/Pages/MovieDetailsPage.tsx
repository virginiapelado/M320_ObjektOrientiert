import { useEffect } from "react";
import Header from "../Organisms/Header";
import MovieDetails from "../Organisms/MovieDetails";
import "./style.css";
import { Movie } from "../../Service/Movie";

const MovieDetailsPage = () => {
  return (
    <div
      className="movie-details-page"
      style={{ height: "100vh", overflow: "scroll", overflowX: "hidden" }}>
      <div className="details-page-body">
        <Header />
        <MovieDetails />
      </div>
    </div>
  );
};

export default MovieDetailsPage;
