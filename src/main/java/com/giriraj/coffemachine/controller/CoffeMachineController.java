package com.giriraj.coffemachine.controller;

import com.giriraj.coffemachine.model.CoffeMachine;
import com.giriraj.coffemachine.service.CoffeMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeMachineController {
    @Autowired
    private CoffeMachineService coffeMachineService;
    @PostMapping("/prepareBeverage")
    public ResponseEntity<List<String>> prepareBeverage(@RequestBody CoffeMachine coffeMachine) {
        return new ResponseEntity<>(coffeMachineService.prepareBeverage(coffeMachine), HttpStatus.OK);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
