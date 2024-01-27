import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";


const MovieService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getMovie: async () => {
        const data = await api.get('quiz');
        return data['data'];
    },
})

export default MovieService