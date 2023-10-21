package com.example.cg_finance_managers.controller;

import com.example.cg_finance_managers.model.User;
import com.example.cg_finance_managers.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("register")
    private ResponseEntity<User>registerUser(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user),HttpStatus.OK);
    }

}
