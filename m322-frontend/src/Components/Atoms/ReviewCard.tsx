import * as React from "react";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import { Reviews } from "../../Service/Reviews";
import { useState } from "react";
import ReviewService from "../../Service/ReviewService";

export default function ReviewCard(review: Reviews) {
  const [reviewDetails, setReviewDetails] = useState<Reviews[]>([]);

  React.useEffect(() => {
    ReviewService()
      .getReviewsByMovie(review.movie.id)
      .then((reviews: Reviews[]) => {
        setReviewDetails(reviews);
      })
      .catch(() => console.log("failed to fetch review"));
  });

  return (
    <div>
      {reviewDetails?.map((item) => {
        return (
          <div>
            <Card sx={{ minWidth: 275 }}>
              <CardContent>
                <Typography
                  sx={{ fontSize: 14 }}
                  color="text.secondary"
                  gutterBottom
                ></Typography>
                <Typography variant="h5" component="div">
                  {review.reviewTitle}
                </Typography>
                <Typography sx={{ mb: 1.5 }} color="text.secondary">
                  {review.rating}/5
                </Typography>
                <Typography variant="body2">{review.description}</Typography>
              </CardContent>
              <CardActions>
                <Button size="small">Delete</Button>
              </CardActions>
            </Card>
          </div>
        );
      })}
    </div>
  );
}
