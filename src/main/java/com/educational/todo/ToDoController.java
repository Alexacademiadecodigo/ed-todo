package com.educational.todo;

import com.educational.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todo")
public class ToDoController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public ResponseEntity<String> test(){

        String test = "putas";
       return new ResponseEntity<String>(test, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test2")
    public ResponseEntity<Integer> test2(){

        Integer myInteger = 69;
        return new ResponseEntity<Integer>(myInteger, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public ResponseEntity<Boolean> login(@RequestBody LoginInfo loginInfo){

        System.out.println("username: " + loginInfo.getUsername() );
        System.out.println("password: " + loginInfo.getPassword());

        if(loginInfo.getUsername().length() < 3){
            return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
        }
         return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }



}

class LoginInfo{

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
