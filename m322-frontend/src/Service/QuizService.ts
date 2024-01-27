import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";
import { Quiz } from "./Quiz";


const QuizService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getMovie: async () => {
        const data = await api.get('/movies/quiz');
        return data['data'];
    },
    submitAnswer: async ( quiz:Quiz ) => {
        const data = await api.post('/movies/quiz', quiz);
    }
})

export default QuizService