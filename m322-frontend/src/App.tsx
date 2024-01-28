import React from "react";
import "./App.css";
import { Navigate, Route, Routes } from "react-router-dom";
import PageNotFound from "./Components/Pages/PageNotFound";
import ExplorePage from "./Components/Pages/ExplorePage";
import HomePage from "./Components/Pages/HomePage";
import LoginPage from "./Components/Pages/LoginPage";
import QuizPage from "./Components/Pages/QuizPage";
import SignupPage from "./Components/Pages/SignupPage";
import MovieDetails from "./Components/Pages/MovieDetailsPage";
import MovieDetailsPage from "./Components/Pages/MovieDetailsPage";

function App() {
  return (
    <Routes>
      <Route path="/home" element={<HomePage />} />
      <Route path="/explore" element={<ExplorePage />} />
      <Route path="/explore/:id" element={<MovieDetails />} />
      <Route path="/login" element={<LoginPage />} />
      <Route path="/signup" element={<SignupPage />} />
      <Route path="*" element={<PageNotFound />} />
      <Route path="/" element={<Navigate to="/home" />} />
      <Route path="/quiz" element={<QuizPage />} />
      <Route path="/details" element={<MovieDetailsPage />} />

    </Routes>
  );
}

export default App;
