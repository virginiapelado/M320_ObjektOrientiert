// SignupPage.tsx
import React from "react";
import Signup from "../Organisms/Signup";

const SignupPage: React.FC = () => {
  const handleSignup = (
    name: string,
    email: string,
    password: string
  ): void => {
    console.log("Signup submitted:", { name, email, password });
  };

  return (
    <div>
      <Signup onSubmit={handleSignup} />
    </div>
  );
};

export default SignupPage;
