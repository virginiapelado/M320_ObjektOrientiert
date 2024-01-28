import Header from "../Organisms/Header";
import MovieDetails from "../Organisms/MovieDetails";
import "./style.css";

const MovieDetailsPage = () => {
  return (
    <div className="movie-details-page">
      <div className="details-page-body">
        <Header />
        <MovieDetails />
      </div>
    </div>
  );
};

export default MovieDetailsPage;
