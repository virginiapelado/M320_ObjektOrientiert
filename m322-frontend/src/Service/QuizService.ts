import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";
import { Quiz } from "./Quiz";

const QuizService = (api: AxiosInstance = defaultAxiosInstance) => ({
  getMovie: async () => {
    const data = await api.get("/movies/quiz");
    return data["data"];
  },
  submitAnswer: async (quiz: Quiz) => {
    try {
      const transformedAnswers = transformAnswers(quiz);

      const data = await api.post("/movies/quiz", transformedAnswers);
      return data;
    } catch (error) {
      throw error;
    }
  },
});

const transformAnswers = (quiz: Quiz) => {
  return {
    id: quiz.id,
    question: quiz.question,
    answerA: quiz.answerA,
    answerB: quiz.answerB,
    answerC: quiz.answerC,
    answerD: quiz.answerD,
    answerE: quiz.answerE,
  };
};

export default QuizService;
