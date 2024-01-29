import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./style.css";
import { Reviews } from "../../Service/Reviews";
import ReviewService from "../../Service/ReviewService";
import { Card } from "@mui/material";

export default function ReviewsCard() {
  const navigate = useNavigate();
  const [reviewDetails, setReviewDetails] = useState<Reviews[]>([]);

  useEffect(() => {
    ReviewService()
      .getReviews()
      .then((reviews) => {
        setReviewDetails(reviews);
      })
      .catch(() => console.log("failed to fetch reviews"));
  }, []);

  return (
    <div>
      <div className="movie-details-container">
        {reviewDetails && (
          <Card
            id={reviewDetails.id}
            rating={reviewDetails.rating}
            reviewTitle={reviewDetails.reviewTitle}
            description={reviewDetails.description}
            movie={reviewDetails.movie}
            userReviews={reviewDetails.userReviews}
          />
        )}
      </div>
    </div>
  );
}
