import axios, { AxiosError, AxiosInstance, InternalAxiosRequestConfig } from "axios";

const BASE_URL = `http://localhost:8080/`;

export const defaultAxiosInstance: AxiosInstance = axios.create({
  baseURL: BASE_URL,
});

defaultAxiosInstance.interceptors.request.use(
  (config: InternalAxiosRequestConfig<any>) => {
    // Check if the request is for the login endpoint
    const isLoginPath: boolean = config.url === "login";
    
    // Exclude Authorization header for login endpoint
    if (!isLoginPath && localStorage.getItem("accessToken") !== "") {
      config.headers.Authorization = `Bearer ${localStorage.getItem("accessToken")}`;
    }

    return config;
  },

  (error: AxiosError) => {
    return Promise.reject(error);
  }
);

export default defaultAxiosInstance;
