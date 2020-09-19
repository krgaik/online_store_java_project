package karolina.projects.online_store_project.Controller;

import karolina.projects.online_store_project.Controller.RequestPojo.ApiResponse;
import karolina.projects.online_store_project.Model.User;
import karolina.projects.online_store_project.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/signup")
public class SignUpController {
    @Autowired
    UserService userservice;
    @RequestMapping("user")
    public ResponseEntity<?> userLogin(@RequestBody HashMap<String,String> signupRequest) {
        try {
            //TODO validation has to add for client request
            User user = userservice.signUpUser(signupRequest);
            return  ResponseEntity.ok(user);
        }catch(Exception e ) {
            return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage(), ""));
        }
    }
}