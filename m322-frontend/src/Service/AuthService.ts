import { defaultAxiosInstance } from "./Api"
import { AxiosInstance } from "axios"

/*const AuthService = (api: AxiosInstance = defaultAxiosInstance) => ({
    login: async (email : string, password : string) => {
        const response = await api.post('login', {email, password})
        if(response && response.status === 200) {
            localStorage.setItem("accessToken", response.data.accessToken)
            return response["data"]
        }
    }
})

export default AuthService
*/