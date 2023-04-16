package com.kdpwallet.kdpwallet.controller;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;


@RestController
@RequestMapping("/employee")
//@Api(value = "Employee Management", protocols = "https")
public class UserController {

//    @PostMapping("/api/createuser")
//    public void createUser(User user){
//        System.out.println(user);
//    }

  //  @ApiOperation(value = "To access particular employee by passing the employee id", response = User.class, code = 200)
    @GetMapping(value = "/hello")
    public String createProduct() {
        return "Product is  chupamelaaa saved successfully";
    }

    ConcurrentHashMap<String, User> employees = new ConcurrentHashMap<>();

 //   @ApiOperation(value = "To access particular employee by passing the employee id", response = User.class, code = 200)
    @GetMapping("/{id}")
    public User getContact(@PathVariable String id){
        return employees.get(id);
    }

  //  @ApiOperation(value = "get op", response = String.class, code = 200)
    @PostMapping("/postsmt")
    public String postSmt(){
        return "this is a post operation";
    }


   // @ApiOperation(value = "get op", response = String.class, code = 200)
    @GetMapping("/getsmt")
    public String getSmt(){
        return "this is a post operation";
    }
}


