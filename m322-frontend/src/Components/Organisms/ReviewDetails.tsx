import { useNavigate, useParams } from "react-router-dom";
import ReviewsCard from "../Molecules/ReviewCard";
import { useEffect, useState } from "react";
import { Reviews } from "../../Service/Reviews";
import ReviewService from "../../Service/ReviewService";

const ReviewsOverview = () => {
  const navigate = useNavigate();
  const [reviewDetails, setReviewDetails] = useState<Reviews[]>([]);

  useEffect(() => {
    const movieId = MovieService().reviewDetails.data.id;
    const id = movieId.includes("reviews").movie.id;

    if (id) {
      ReviewService()
        .getReviewsByMovie(id)
        .then((reviews) => {
          setReviewDetails(reviews);
        })
        .catch(() => console.log("failed to fetch movies"));
    }
  }, []);

  // loop through and show all reviews based on the movie id
  return (
    <div>
      {reviewDetails.map((review) => (
        <div key={review.id} className="movie-details-container">
          <ReviewsCard
            id={review.id}
            rating={review.rating}
            reviewTitle={review.reviewTitle}
            description={review.description}
            movie={review.movie}
            userReviews={review.userReviews}
          />
        </div>
      ))}
    </div>
  );
};

export default ReviewsOverview;
