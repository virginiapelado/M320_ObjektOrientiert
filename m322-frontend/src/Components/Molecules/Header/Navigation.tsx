// Navigation.tsx
import React, { useEffect, useState } from "react";
import Pages from "./Pages";
import SearchBar from "../../Atoms/Header/SearchBar"; // Make sure the import path is correct
import LoginButton from "../../Atoms/Header/LoginButton";
import MovieService from "../../../Service/MovieService";
import { Movie } from "../../../Service/Movie";

export default function Navigation() {
  const [allMovies, setAllMovies] = useState<Movie[]>([]);
  const [filteredMovies, setFilteredMovies] = useState<Movie[]>([]);

  useEffect(() => {
    // Fetch movies or set movies using your data source
    const fetchMovies = async () => {
      const movieService = MovieService();
      const movies = await movieService.getMovie();
      setAllMovies(movies);
      setFilteredMovies(movies); // Initially, set filteredMovies to allMovies
    };

    fetchMovies();
  }, []);

  const handleSearch = (query: string) => {
    const filtered = allMovies.filter((movie) =>
      movie.movieTitle.toLowerCase().includes(query.toLowerCase())
    );
    setFilteredMovies(filtered);
  };

  return (
    <div style={{ display: "flex", alignItems: "center" }}>
      <Pages />
      <div style={{ marginRight: "40px" }} />
      <SearchBar onSearch={handleSearch} />
      <div style={{ marginRight: "40px" }} />
      <LoginButton />
    </div>
  );
}
