import React from "react";
import "./App.css";
import { Navigate, Route, Routes } from "react-router-dom";
import PageNotFound from "./Components/Pages/PageNotFound";

function App() {
  return (
    <Routes>
      <Route path="/home" element={<PageNotFound />} />
      <Route path="/movie" element={<PageNotFound />} />
      <Route path="/movie/:id" element={<PageNotFound />} />
      <Route path="/login" element={<PageNotFound />} />
      <Route path="*" element={<PageNotFound />} />
      <Route path="/" element={<Navigate to="/home" />} />
    </Routes>
  );
}

export default App;
