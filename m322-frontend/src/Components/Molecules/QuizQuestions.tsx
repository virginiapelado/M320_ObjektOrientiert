import { useEffect, useState } from "react";
import { Box } from "@mui/material";
import { Category } from "../../Service/Category";
import { MovieQuiz } from "../../Service/MovieQuiz";
import { Movie } from "../../Service/Movie";
import QuizCard from "./QuizCard";

export type MovieQuizType = {
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

  function QuizQuestions (prop: MovieQuizType){
    const [questions, setQuestions] = useState<MovieQuizType[]>([]);

    // useEffect(() => {
    //     MovieQuiz().getQuestions().then((result : MovieQuizType[]) => setQuestions(result))  
    //   },[])
    // add later when asios and MovieQuizService are done

      return(
        <Box>
        <div>
            {questions.map(question => {
                return(
                    <QuizCard
                    prop={question}/>
                )
            }
            )}
        </div>
    </Box>
      )
  }

 export default QuizQuestions;
