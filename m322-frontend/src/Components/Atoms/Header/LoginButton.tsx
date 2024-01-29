import React from "react";
import Button from "@mui/material/Button";
import { Link, useLocation } from "react-router-dom";
import PersonIcon from "@mui/icons-material/Person";

export default function LoginButton() {
  const defaultColor = "#463F3A";
  const hoverColor = "#3d342e";
  const activeColor = "#D17B34";

  const location = useLocation();
  const isActive = location.pathname === "/login";

  return (
    <Link to="/login" style={{ textDecoration: "none" }}>
      <Button
        sx={{
          background: isActive ? activeColor : defaultColor,
          ":hover": {
            background: isActive ? activeColor : hoverColor,
          },
          width: "40px",
          height: "40px",
          flexShrink: 0,
          borderRadius: "15px",
          color: "white",
          fontSize: "18px",
        }}
      >
        <PersonIcon />
      </Button>
    </Link>
  );
}
