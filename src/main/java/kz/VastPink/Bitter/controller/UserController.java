package kz.VastPink.Bitter.controller;

import kz.VastPink.Bitter.entity.UserEntity;
import kz.VastPink.Bitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping (value = "/")
    public List<UserEntity> getUsers() {
        try {
            return userRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping (value = "/{id}")
    public UserEntity getUser(@PathVariable Long id) {
        try {
            return userRepository.getOne(id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping (value = "/")
    public UserEntity addUser(){
        try {
            UserEntity entity = new UserEntity("username","name","surname");
            return userRepository.save(entity);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
