package karolina.projects.online_store_project.Service.UserService;

import karolina.projects.online_store_project.Model.User;
import karolina.projects.online_store_project.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User findByMobile(String mobile) throws Exception {
        return userRepo.findByMobile(mobile).orElseThrow(()->new Exception("User Not found.."));
    }

    @Override
    public User getUserDetailById(long userId) throws Exception {

        return userRepo.findById(userId).orElseThrow(()->new Exception("User Not found.."));
    }

    @Override
    public User signUpUser(HashMap<String, String> signupRequest) throws Exception {
        try {
            if(userRepo.findByMobile(signupRequest.get("mobile")).isPresent()) {
                throw new Exception("User is already registered with Mobile No.");
            }
            User user = new User();
            user.setName(signupRequest.get("name"));
            user.setEmail(signupRequest.get("email"));
            user.setMobile(signupRequest.get("mobile"));
            user.setPassword(signupRequest.get("password"));
            userRepo.save(user);
            return user;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}