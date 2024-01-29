import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";
import { Reviews } from "./Reviews";
import { Category } from "./Category";
import { User } from "./User";
import { Movie } from "./Movie";

const ReviewService = (api: AxiosInstance = defaultAxiosInstance) => ({
  getReviewsByMovie: async (movieId: string) => {
    const data = await api.get(`/reviews/movies/${movieId}`);
    return data["data"];
  },

  getReviewById: async (id: string) => {
    const data = await api.get(`/reviews/${id}`);
    return data["data"];
  },

  postReviewById: async (
    id: string,
    rating: number,
    reviewTitle: string,
    description: string,
    movie: Movie,
    userReviews: User
  ) => {
    const data = await api.post("/reviews", {
      rating: rating,
      reviewTitle: reviewTitle,
      description: description,
      movie: movie.id,
      userReviews: userReviews.id,
    });
    return data["data"];
  },
  deleteMovieById: async (id: string) => {
    const data = await api.delete(`/reviews/${id}`);
    return data["data"];
  },
  putMovieById: async (
    id: string,
    rating: number,
    reviewTitle: string,
    description: string,
    movie: Movie,
    userReviews: User
  ) => {
    const data = await api.put(`/reviews/${id}`, {
      rating: rating,
      reviewTitle: reviewTitle,
      description: description,
      movie: movie.id,
      userReviews: userReviews.id,
    });
    return data["data"];
  },
});

export default ReviewService;
