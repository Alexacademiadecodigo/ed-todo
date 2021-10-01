package com.educational.todo.controler;


import com.educational.todo.Model.Task;
import com.educational.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(method = RequestMethod.POST , path = "/createtask")
    public ResponseEntity<Boolean> createTask(@RequestBody Task task){

        System.out.println(task.getDescr());
        this.taskRepository.save(task);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }


}
