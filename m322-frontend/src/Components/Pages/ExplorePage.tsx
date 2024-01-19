// ExplorePage.js
import React, { useEffect } from "react";
import Filters from "../Organisms/Filters";
import Header from "../Organisms/Header";
import "./style.css";

const ExplorePage = () => {
  useEffect(() => {
    document.body.classList.remove("home-page-background");
  }, []);

  return (
    <div>
      <Header />
      <Filters />
    </div>
  );
};

export default ExplorePage;
