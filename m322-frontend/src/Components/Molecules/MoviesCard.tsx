import React, { useEffect, useState } from "react";
import ThumbnailCard from "../Atoms/ThumbnailCard";
import { useNavigate } from "react-router-dom";
import { Movie } from "../../Service/Movie";
import MovieService from "../../Service/MovieService";
import "./style.css";

export default function MoviesCard() {
  const navigate = useNavigate();
  const [movieDetails, setMovieDetails] = useState<Movie[]>([]);

  useEffect(() => {
    MovieService()
      .getMovie()
      .then((movies: Movie[]) => {
        setMovieDetails(movies);
      })
      .catch(() => console.log("failed to fetch movies"));
  }, []);

  const chunkArray = (arr: Movie[], size: number) => {
    return Array.from({ length: Math.ceil(arr.length / size) }, (_, index) =>
      arr.slice(index * size, (index + 1) * size)
    );
  };

  const titles = [
    "Trending Now",
    "Comedy Films",
    "Psychological Films",
    "Action Films",
  ];

  return (
    <div className="movies-mapped">
      {titles.map((title, titleIndex) => (
        <div key={titleIndex} className="movies-group">
          <h2>{title}</h2>
          <div className="movies-row">
            {chunkArray(movieDetails, 5).map((row, rowIndex) => (
              <React.Fragment key={rowIndex}>
                {rowIndex === titleIndex &&
                  row.map((item) => (
                    <div key={item.id} className="movie-card">
                      <ThumbnailCard
                        id={item.id}
                        movieTitle={item.movieTitle}
                        thumbnail={item.thumbnail}
                        image={item.image}
                        movieCategory={item.movieCategory}
                        movieReviews={item.movieReviews}
                        release_date={item.release_date}
                        director={item.director}
                        movieLength={item.movieLength}
                        movieDesc={item.movieDesc}
                        trendingNow={item.trendingNow}
                      />
                    </div>
                  ))}
              </React.Fragment>
            ))}
          </div>
        </div>
      ))}
    </div>
  );
}
