import { Movie } from "./Movie";
import { User } from "./User";

export interface Reviews {
    rating : number,
    reviewTitle : string,
    description : string,
    movie : Movie
    userReviews : User
}