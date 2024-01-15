import React from "react";
import Button from "@mui/material/Button";

export default function MyButton() {
  const defaultColor = "#BCB8B1";
  const hoverColor = "#A39F97";
  const textColor = "#000000";

  return (
    <Button
      variant="contained"
      sx={{
        background: defaultColor,
        ":hover": {
          background: hoverColor,
        },
        width: 120,
        height: 32,
        color: textColor,
      }}
    >
      Rating
    </Button>
  );
}
