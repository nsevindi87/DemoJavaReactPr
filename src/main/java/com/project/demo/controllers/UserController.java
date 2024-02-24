package com.project.demo.controllers;

import com.project.demo.services.UserService;
import com.project.demo.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    /*
    Controller icerisine userService bilgilerini getiriyoruz. Asagida kullanacagiz.
    Serviceden de repositorye baglanacagiz. Burasi ara katman yani kontroller.
    */

    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllusers();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        return userService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Long userId){
        return userService.getOneUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser ){
        return userService.updateOneUser(userId,newUser);

    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
        userService.deleteById(userId);
    }
}
