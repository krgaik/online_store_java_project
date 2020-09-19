package karolina.projects.online_store_project.Service.UserService;

import karolina.projects.online_store_project.Model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public interface UserService {
    User findByMobile(String mobile) throws Exception;
    User getUserDetailById(long userId) throws Exception;
    User signUpUser(HashMap<String,String> signupRequest) throws Exception;

}