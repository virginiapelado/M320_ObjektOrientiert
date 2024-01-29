<<<<<<< HEAD
=======
import { useEffect, useState } from "react";
>>>>>>> ac0432e58727649937c67c68aaa5f0d112f8bd0a
import Header from "../Organisms/Header";
import MovieDetails from "../Organisms/MovieDetails";
import "./style.css";
import { Movie } from "../../Service/Movie";
import { useNavigate, useParams } from "react-router-dom";
import MovieService from "../../Service/MovieService";

const MovieDetailsPage = () => {
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
    <div
      className="movie-details-page"
      style={{
        height: "100vh",
        overflow: "scroll",
        overflowX: "hidden",
        background: `url('${movieDetails?.image!}`,
      }}>
      <div className="details-page-body">
        <Header />
        <MovieDetails />
      </div>
    </div>
  );
};

export default MovieDetailsPage;
