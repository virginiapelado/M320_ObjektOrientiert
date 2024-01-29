import React, { useState } from "react";
import ReviewCard from "../Atoms/ReviewCard";
import { Reviews } from "../../Service/Reviews";
import ReviewService from "../../Service/ReviewService";

export default function ReviewMapping() {
  const [reviewDetails, setReviewDetails] = useState<Reviews[]>([]);

  React.useEffect(() => {
    ReviewService()
      .getReviews()
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
            <ReviewCard
              id={item.id}
              rating={item.rating}
              reviewTitle={item.reviewTitle}
              description={item.description}
              movie={item.movie}
              userReviews={item.userReviews}
            />
          </div>
        );
      })}
    </div>
  );
}
