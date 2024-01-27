import React from "react";
import Logo from "../Atoms/Header/Logo";
import Navigation from "../Molecules/Header/Navigation";
import "./Header.css"; // Create a separate CSS file for styling

export default function Header() {
  return (
    <div className="header">
      <Logo />
      <Navigation />
    </div>
  );
}
