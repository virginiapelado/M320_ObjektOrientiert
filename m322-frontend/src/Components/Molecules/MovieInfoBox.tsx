import { Movie } from "../../Service/Movie";
import GenreDisplay from "../Atoms/GenreDisplay";
import "./MovieInfoBox.css";

export default function MovieInfoBox(movie: Movie) {
  return (
    <div className="details-box">
      <div className="first-half">
        <h1 className="movie-data">{movie.movieTitle}</h1>
        <div className="info-data">{movie.movieDesc}</div>
      </div>
      <div className="second-half">
        <div className="movie-info">
          <div className="info-label">
            <h2>Released</h2>
          </div>
          <div className="info-data">{movie.release_date}</div>
        </div>
        <div className="movie-info">
          <div className="info-label">
            <h2>Directors</h2>
          </div>
          <div className="info-data">{movie.director}</div>
        </div>
        <div className="movie-info">
          <div className="info-label">
            <h2>Length</h2>
          </div>
          <div className="info-data">{movie.movieLength} minutes</div>
        </div>
      </div>
    </div>
  );
}
