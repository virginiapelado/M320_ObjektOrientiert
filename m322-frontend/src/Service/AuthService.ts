import { defaultAxiosInstance } from "./Api";
import { AxiosInstance } from "axios";

export const AuthService = (api: AxiosInstance = defaultAxiosInstance) => ({
  login: async (username: string, password: string) => {
    try {
      const response = await api.post("user/login", { username, password });

      if (response && response.status === 200) {
        localStorage.setItem("accessToken", response.data.accessToken);
        return response.data;
      }
    } catch (error) {
      console.error("Login error:", error);
      throw error;
    }
  },
});
