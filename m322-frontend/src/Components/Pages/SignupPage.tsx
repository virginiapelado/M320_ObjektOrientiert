import React from "react";
import Signup from "../Organisms/Signup";

export default function SignupPage() {
  return (
    <div>
      <Signup onSubmit={function (name: string, email: string, password: string): void {
              throw new Error("Function not implemented.");
          } } />
    </div>
  );
}
