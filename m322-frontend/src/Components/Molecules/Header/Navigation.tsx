import React from "react";
import Pages from "./Pages";
import SearchBar from "../../Atoms/Header/SearchBar";
import LoginButton from "../../Atoms/Header/LoginButton";

export default function Navigation() {
  return (
    <div style={{ display: "flex", alignItems: "center" }}>
      <Pages />
      <div style={{ marginRight: "40px" }} />
      <SearchBar />
      <div style={{ marginRight: "40px" }} />
      <LoginButton />
    </div>
  );
}
