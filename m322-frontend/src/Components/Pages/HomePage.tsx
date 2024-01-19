// HomePage.js
import React, { useEffect } from "react";
import Header from "../Organisms/Header";
import "./style.css";

const HomePage = () => {
  useEffect(() => {
    document.body.classList.add("home-page-background");
    return () => {
      document.body.classList.remove("home-page-background");
    };
  }, []);

  return (
    <div className="home-page">
      <Header />
    </div>
  );
};

export default HomePage;
