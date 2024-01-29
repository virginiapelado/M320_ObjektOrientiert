import React, { useState } from "react";
import "./login.css";
import { Link, useNavigate } from "react-router-dom";
import { Button } from "@mui/material";

interface LoginProps {
  onSubmit: (email: string, password: string) => void;
}

const Login: React.FC<LoginProps> = ({ onSubmit }) => {
  const navigate = useNavigate();
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");

  const handleEmailChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setPassword(e.target.value);
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      navigate("/home");
    } catch (error) {
      setError("Invalid email or password");
    }
  };

  return (
    <div className="login-container">
      <form className="login-form" onSubmit={handleSubmit}>
        <div className="input-group">
          <h2>Email:</h2>
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
        <Button variant="contained" type="submit" id="submit-button">
          Log in
        </Button>
        <div className="signup">
          <p>Don't have an account?</p>{" "}
          <Link to="/signup" className="link">
            Sign up
          </Link>
        </div>
      </form>
    </div>
  );
};

export default Login;
