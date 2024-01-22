import React from "react";
import Button from "@mui/material/Button";
import { Link } from "react-router-dom";
import PersonIcon from '@mui/icons-material/Person';

export default function LoginButton() {
  const defaultColor = "#463F3A";
  const hoverColor = "#3d342e";

  return (
    <Link to="/login" style={{ textDecoration: "none" }}>
    <Button
      sx={{
        background: defaultColor,
        ":hover": {
          background: hoverColor,
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
