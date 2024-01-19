import React from "react";
import Logo from "../Atoms/Logo";
import Navigation from "../Molecules/Navigation";

export default function Header() {
  return (
    <div
      style={{
        display: "flex",
        alignItems: "flex-end",
        paddingTop: "20px",
        justifyContent: "center",
        gap: "30px",
      }}
    >
      <Logo />
      <Navigation />
    </div>
  );
}
