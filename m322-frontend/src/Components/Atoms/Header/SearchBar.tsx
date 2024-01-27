import React from "react";
import TextField from "@mui/material/TextField";
import SearchIcon from "@mui/icons-material/Search";

export default function SearchBar() {
  return (
    <TextField
      id="outlined-basic"
      label=""
      variant="outlined"
      size="small"
      style={{
        backgroundColor: "#BCB8B1",
        borderRadius: "8px",
        width: "371px",
      }}
      InputProps={{
        endAdornment: (
          <SearchIcon
            style={{
              color: "#463F3A",
              padding: "5px",
            }}
          />
        ),
      }}
    />
  );
}
