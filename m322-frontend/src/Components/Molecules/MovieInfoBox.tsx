import { Movie } from "../../Service/Movie";
import AddModal from "../Organisms/AddModal";
import ReviewMapping from "../Organisms/ReviewMapping";
import "./MovieInfoBox.css";

export default function MovieInfoBox(movie: Movie) {
  return (
    <div className="MovieInfoBox">
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
      <div className="additional-info">
        <div className="reviews">
          <h1>Reviews</h1>
          <AddModal />
          <ReviewMapping />
        </div>
      </div>
    </div>
  );
}
