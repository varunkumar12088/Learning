package com.learning.controller;

import com.learning.domain.Request;
import com.learning.domain.Response;
import com.learning.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/learning")
public class LearningController {

    @Autowired
    private LearningService learningService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<?> learn(@RequestBody Request request){
        System.out.println("=========================");
       Response response = learningService.learn(request);
       return ResponseEntity.ok(response);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<?> learn(){
        System.out.println("=========================");
        Response response = learningService.learn();
        return ResponseEntity.ok(response);
    }

}
