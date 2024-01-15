import { Button } from "@mui/material";
import { Link, useLocation } from "react-router-dom";

export default function HomeButton() {
  const location = useLocation();
  const isActive = location.pathname === "/home";
  const textColor = "#FFFFFF";
  const highlight = "#D17B34";

  return (
    <Link to="/home" style={{ textDecoration: "none" }}>
      <Button
        className={`home-button ${isActive ? "active" : ""}`}
        style={{
          color: textColor,
          position: "relative",
          height: "27px",
          width: "73px",
          overflow: "hidden",
        }}
      >
        Home
        {isActive && (
          <span
            className="highlight"
            style={{
              position: "absolute",
              bottom: 0,
              left: 0,
              width: "100%",
              height: "3px",
              background: highlight,
              borderRadius: "3px 3px 0 0",
            }}
          />
        )}
      </Button>
    </Link>
  );
}
