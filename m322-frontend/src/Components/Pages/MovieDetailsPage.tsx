import { Card, CardContent, CardMedia, Typography } from "@mui/material";
import { MovieQuizType } from "../Molecules/QuizQuestions";
import Header from "../Organisms/Header";
import { useEffect } from "react";
import DetailsBox from "../Molecules/DetailsBox";

const MovieDetailsPage = () => {
    useEffect(() => {
      document.body.classList.add("home-page-background");
      return () => {
        document.body.classList.remove("home-page-background");
      };
    }, []);
    return (
      <div>
        <Header />
        <DetailsBox />

{/*     
    <Card sx={{ maxWidth: 250 }}>
    <CardMedia sx={{ height: 40 }} title="Details of employee" />
    <CardContent>
      <Typography gutterBottom variant="h5" component="div">
        <div>{prop.first_name + " " + prop.last_name}</div>
      </Typography>
      <Typography variant="body1" color="text.secondary">
        Id: {prop.id}
        <br />
        Birth date: {prop.birth_date}
        <br />
        Gender: {prop.gender}
        <br />
        Hire date: {prop.hire_date}
      </Typography>
    </CardContent>
  </Card>
   */}
      </div>
    );
  }

  export default MovieDetailsPage;