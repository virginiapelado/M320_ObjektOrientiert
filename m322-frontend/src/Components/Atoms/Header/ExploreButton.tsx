import { Button } from "@mui/material";
import { Link, useLocation } from "react-router-dom";

export default function ExploreButton() {
  const location = useLocation();
  const isActive = location.pathname === "/explore";
  const textColor = "#FFFFFF";
  const highlight = "#D17B34";

  return (
    <Link to="/explore" style={{ textDecoration: "none" }}>
      <Button
        className={`explore-button ${isActive ? "active" : ""}`}
        style={{
          color: textColor,
          position: "relative",
          height: "27px",
          width: "73px",
          overflow: "hidden",
        }}
      >
        Explore
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
