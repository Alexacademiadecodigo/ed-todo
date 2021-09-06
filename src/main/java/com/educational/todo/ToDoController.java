package com.educational.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todo")
public class ToDoController {

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

    @RequestMapping(method = RequestMethod.POST, path = "/test3")
    public ResponseEntity<Boolean> test3(@RequestBody String valid){

        if(valid.length() < 1){
            return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }
}
