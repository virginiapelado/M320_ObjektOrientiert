import { Category } from "./Category"
import { Reviews } from "./Reviews"

export interface Movie {
    id : string,
    movieTitle : string,
    thumbnail : string,
    image : string,
    movieCategory : Category,
    movieReviews : Reviews,
    release_date : string,
    director : string,
    movieLength : number,
    movieDesc : string
    trendingNow : boolean
}