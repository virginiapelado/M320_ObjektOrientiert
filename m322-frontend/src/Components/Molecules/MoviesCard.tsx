import React, { useEffect, useState } from "react";
import ThumbnailCard from "../Atoms/ThumbnailCard";
import { useNavigate } from "react-router-dom";
import { Movie } from "../../Service/Movie";
//import MovieService from "../../Service/MovieService";

export default function MoviesCard() {
  const navigate = useNavigate();
  const [movieDetails, setMovieDetails] = useState<Movie[]>([]);

  /*useEffect(() => {
    MovieService()
      .getMovie()
      .then((movieDetails: Movie[]) => {
        setMovieDetails(movieDetails);
      })
      .catch(() => navigate("/login", { replace: true }));
  });
  */
  return (
    <div>
      {movieDetails?.map((item) => {
        return (
          <div>
            <ThumbnailCard
              id={item.id}
              movie_name={item.movie_name}
              thumbnail={item.thumbnail}
              image={item.image}
              genre={item.genre}
              rating={item.rating}
              release_date={item.release_date}
              director={item.director}
              length={item.length}
              description={item.description}
            />
          </div>
        );
      })}
    </div>
  );
}
