package com.trialapp.appone.aocontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trialapp.appone.aomodel.User;
import com.trialapp.appone.aoservices.UserService;

@RestController
public class RestAOController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String Hello() {
        return "This is Home Page";
    }
    
    @GetMapping("/saveuser")
    public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
        User user = new User(username, firstname, lastname, age, password);
        userService.saveMyUser(user);
        return "User is saved.";
    }

}
