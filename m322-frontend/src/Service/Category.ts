import { Movie } from "./Movie";

export interface Category {
    category : String,
    movies : Set<Movie>
}