import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";


const MovieService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getMovie: async () => {
        const data = await api.get('movie?_limit=10');
        return data['data'];
    },
    getMovieById: async ( id:string ) => {
        const data = await api.get(`movie/${id}`);
        return data['data'];
    },
    postMovieById: async ( name:string ) => {
        const data = await api.post('movie', {"movie_name": name});
        return data['data'];
    },
    deleteMovieById: async ( id:string ) => {
        const data = await api.delete(`movie/${id}`);
        return data['data'];
    },
    putMovieById: async ( id:string, name:string) => {
        const data = await api.put(`movie/${id}`, {"movie_name": name});
        return data['data'];
    }
})

export default MovieService