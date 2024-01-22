import { Category } from "./Category";
import { Movie } from "./Movie";

export interface MovieQuiz {
    id : string,
    question : string,
    answerA : string,
    answerB : string,
    answerC : string,
    answerD : number,
    answerE : string,
    chosenAnswer : string,
    category : Category,
    recommendedMovie : Movie
}