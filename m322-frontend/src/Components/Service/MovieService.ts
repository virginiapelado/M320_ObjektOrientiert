import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";


const MovieService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getMovie: async () => {
        const data = await api.get('explore');
        return data['data'];
    },
    getMovieById: async ( id:string ) => {
        const data = await api.get(`explore/${id}`);
        return data['data'];
    },
    postMovieById: async ( title:string, thumbnail:string, image:string, genre:string, rating:number, release_date:string, director:string, length:number, description : string ) => {
        const data = await api.post('movie', {"movie_name": title, "thumbnail": thumbnail, "image": image, "genre": genre, "rating": rating, "release_date": release_date, "director": director, "length": length, "description": description});
        return data['data'];
    },
    deleteMovieById: async ( id:string ) => {
        const data = await api.delete(`movie/${id}`);
        return data['data'];
    },
    putMovieById: async ( id:string, title:string, thumbnail:string, image:string, genre:string, rating:number, release_date:string, director:string, length:number, description : string ) => {
        const data = await api.put(`explore/${id}`, {"movie_name": title, "thumbnail": thumbnail, "image": image, "genre": genre, "rating": rating, "release_date": release_date, "director": director, "length": length, "description": description});
        return data['data'];
    }
})

export default MovieService