import { MovieQuizType } from "./QuizQuestions";
import { Button, Card, CardActions, CardContent, CardMedia, Typography } from "@mui/material";
import { Link as RouterLink} from "react-router-dom";

// export default function MoviesCard() {
//     const [quizDetails] = useState<MovieQuiz[]>([]);

//     return (
//         <div>
//           {quizDetails?.map((item) => {
//             return (
//               <div>
//                 <QuestionCard
//                   id={item.id}
//                   question={item.question}
//                   answerA={item.answerA}
//                   answerB={item.answerB}
//                   answerC={item.answerC}
//                   answerD={item.answerD}
//                   answerE={item.answerE}
//                   chosenAnswer={item.chosenAnswer}
//                   category={item.category}
//                   recommendedMovie={item.recommendedMovie}
//                 />
//               </div>
//             );
//           })}
//         </div>
//       );
//     }
    

function QuizCard({prop}: {prop: MovieQuizType}) {

    return (
      <Card sx={{ maxWidth: 250 }}>
        <CardMedia
          sx={{ height: 30 }}
            title="Quiz"    
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            <div>
              {prop.question}
            </div>
          </Typography>
        </CardContent>
        <CardActions>
          <Button component={RouterLink} to={`/employees/${prop.id}`}>Learn More</Button>
        </CardActions>
      </Card>
    );
  } 
  
  export default QuizCard;