// ExplorePage.js
import React, { useEffect } from "react";
import Header from "../Organisms/Header";
import "./style.css";
import MovieLayout from "../Organisms/MovieLayout";

const ExplorePage = () => {
  useEffect(() => {
    document.body.classList.remove("home-page-background");
  }, []);

  return (
    <div style={{ height: "100vh", overflow: "scroll", overflowX: "hidden" }}>
      <Header />
      <p className="explore-text">
        Explore all the best movies here! Whether you're looking for a good
        laugh, cry or even both, we have them here.
      </p>
      <MovieLayout />
    </div>
  );
};

export default ExplorePage;
