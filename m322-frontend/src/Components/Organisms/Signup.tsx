import React, { useState } from "react";
import "./signup.css";
import { Button } from "@mui/material";
import { Link, useNavigate } from "react-router-dom";

interface SignupProps {
  onSubmit: (name: string, email: string, password: string) => void;
}

const Signup: React.FC<SignupProps> = ({ onSubmit }) => {
  const navigate = useNavigate();
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");

  const handleNameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setName(e.target.value);
  };

  const handleEmailChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setPassword(e.target.value);
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      await onSubmit(name, email, password);
      navigate("/login");
    } catch (error) {
      setError("Error during signup. Please try again.");
    }
  };

  return (
    <div className="signup-container">
      <form className="signup-form" onSubmit={handleSubmit}>
        <h1>Sign up</h1>
        <div className="input-group">
          <h2>Full Name:</h2>
          <input
            type="text"
            value={name}
            onChange={handleNameChange}
            className="text-input"
          />
        </div>

        <div className="input-group">
          <h2>Email Address:</h2>
          <input
            type="email"
            value={email}
            onChange={handleEmailChange}
            className="text-input"
          />
        </div>

        <div className="input-group">
          <h2>Password:</h2>
          <input
            type="password"
            value={password}
            onChange={handlePasswordChange}
            className="text-input"
          />
        </div>

        {error && <p className="error-message">{error}</p>}

        <Button variant="contained" type="submit" id="submit-button">
          Sign Up
        </Button>

        <div className="login">
          <p>Already have an account?</p>
          <Link to="/login" className="link">
            Log in
          </Link>
        </div>
      </form>
    </div>
  );
};

export default Signup;
