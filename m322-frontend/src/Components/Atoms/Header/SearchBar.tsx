// SearchBar.tsx
import React, { useState, ChangeEvent } from "react";
import TextField from "@mui/material/TextField";
import SearchIcon from "@mui/icons-material/Search";

interface SearchBarProps {
  onSearch: (query: string) => void;
}

const SearchBar: React.FC<SearchBarProps> = ({ onSearch }) => {
  const [searchQuery, setSearchQuery] = useState<string>("");

  const handleInputChange = (event: ChangeEvent<HTMLInputElement>) => {
    setSearchQuery(event.target.value);
  };

  const handleSearch = () => {
    onSearch(searchQuery);
  };

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
            onClick={handleSearch}
            style={{
              color: "#463F3A",
              padding: "5px",
              cursor: "pointer",
            }}
          />
        ),
      }}
      value={searchQuery}
      onChange={handleInputChange}
    />
  );
};

export default SearchBar;
