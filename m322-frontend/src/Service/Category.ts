import { Movie } from "./Movie";
import { MovieQuiz } from "./MovieQuiz";

export interface Category {
    id : string,
    category : string,
    movieCategory : Set<Movie>,
    movieQuiz : Set<MovieQuiz>;
}