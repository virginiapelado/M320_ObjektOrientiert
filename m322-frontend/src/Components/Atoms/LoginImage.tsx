import React from 'react';
import film2 from "../../img/film.png";

export default function LoginImage() {
  return (
    <img
      src={film2}
      alt="Movies"
      style={{
        width: '100%',
        height: '100%',
        objectFit: 'cover',
        borderRadius: '20px', 
      }}
    />
  );
}
