package com.kdpwallet.kdpwallet.controller;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import com.kdpwallet.kdpwallet.repos.UserRepo;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@RequestMapping("/employee")
//@Api(value = "Employee Management", protocols = "https")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("createuser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        System.out.println(user);
        userRepo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(user);
    }

    @DeleteMapping("deleteuser/{id}")
    public void deleteUser(@PathVariable String id){
        User user = userRepo.getReferenceById(id);

        if(user == null){
            throw new RuntimeException("user not found");
        }

        userRepo.delete(user);
    }
}


