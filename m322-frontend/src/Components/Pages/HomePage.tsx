import React, { useEffect } from "react";
import Header from "../Organisms/Header";
import "./style.css";
import RectangleCard from "../Atoms/RectangleCard";

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
      <RectangleCard />
    </div>
  );
};

export default HomePage;
