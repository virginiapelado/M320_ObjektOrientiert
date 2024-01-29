import MovieInfoBox from "../Molecules/MovieInfoBox";
import { useNavigate, useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import { Movie } from "../../Service/Movie";
import MovieService from "../../Service/MovieService";
import "./MovieDetails.css";

const MovieDetails = () => {
  const navigate = useNavigate();
  let { id } = useParams();
  const [movieDetails, setMovieDetails] = useState<Movie>();

  useEffect(() => {
    if (id) {
      MovieService()
        .getMovieById(id)
        .then((movieDetails) => {
          setMovieDetails(movieDetails);
        })
        .catch(() => navigate("/explore", { replace: true }));
    }
  }, [id, navigate]);

  return (
    <div className="movie-details-container">
      <MovieInfoBox
        id={movieDetails?.id!}
        movieTitle={movieDetails?.movieTitle!}
        thumbnail={movieDetails?.thumbnail!}
        image={movieDetails?.image!}
        movieCategory={movieDetails?.movieCategory!}
        movieReviews={movieDetails?.movieReviews!}
        release_date={movieDetails?.release_date!}
        director={movieDetails?.director!}
        movieLength={movieDetails?.movieLength!}
        movieDesc={movieDetails?.movieDesc!}
        trendingNow={movieDetails?.trendingNow!}
      />
    </div>
  );
};

export default MovieDetails;
