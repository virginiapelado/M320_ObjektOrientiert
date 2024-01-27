import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";
import { Reviews } from "./Reviews";
import { Category } from "./Category";


const MovieService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getMovie: async () => {
        const data = await api.get('/movies');
        return data['data'];
    },
    getMovieById: async ( id:string ) => {
        const data = await api.get(`/movies/${id}`);
        return data['data'];
    },
    postMovieById: async ( id:string, movieTitle:string, thumbnail:string, image:string, movieReviews:Reviews, release_date:string, director:string, movieLength:number, movieDesc:string, trendingNow:boolean, movieCategory:Category  ) => {
        const data = await api.post('/movies', {"id": id, "movieTitle": movieTitle, "thumbnail": thumbnail, "image": image, "movieReviews": movieReviews, "release date": release_date, "director": director, "movieLength": movieLength, "movieDesc": movieDesc, "trendingNow": trendingNow, "movieCategory": movieCategory});
        return data['data'];
    },
    deleteMovieById: async ( id:string ) => {
        const data = await api.delete(`/movies/${id}`);
        return data['data'];
    },
    putMovieById: async ( id:string, movieTitle:string, thumbnail:string, image:string, movieReviews:Reviews, release_date:string, director:string, movieLength:number, movieDesc : string, trendingNow:boolean, movieCategory:Category ) => {
        const data = await api.put(`/movies/${id}`, {"movieTitle": movieTitle, "thumbnail": thumbnail, "image": image, "movieReviews": movieReviews, "release date": release_date, "director": director, "movieLength": movieLength, "movieDesc": movieDesc, "trendingNow": trendingNow, "movieCategory": movieCategory});
        return data['data'];
    }
})

export default MovieService