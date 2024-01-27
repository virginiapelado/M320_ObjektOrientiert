import { Movie } from "../../Service/Movie";

export default function MovieInfoBox(movie : Movie) {
    return (
      <div className="details-box">
        {movie.director} {movie.image} {movie.movieTitle}
      </div>
  
    );
  }
  