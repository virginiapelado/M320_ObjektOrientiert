import React from "react";
import TextField from "@mui/material/TextField";
import SearchIcon from "@mui/icons-material/Search";

export default function SearchBar() {
  return (
    <TextField
      id="outlined-basic"
      label=""
      variant="outlined"
      style={{
        backgroundColor: "#BCB8B1",
        borderRadius: "8px",
        width: "371px",
        flexShrink: 0,
      }}
      InputProps={{
        endAdornment: (
          <SearchIcon
            style={{
              color: "#8A817C",
              padding: "10px",
            }}
          />
        ),
      }}
    />
  );
}
