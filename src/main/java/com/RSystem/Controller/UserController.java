package com.RSystem.Controller;


import com.RSystem.Model.UserModel;
import com.RSystem.Service.IUserCourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserCourseServiceImp userService;
    @PostMapping("/save")
    public ResponseEntity<String> crearUser(@RequestBody UserModel user){
        String resultadoHttp = userService.crearUser(user);
        return new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }
    @GetMapping("/get/all")
    public ResponseEntity<List<UserModel>> ListarUser(){
        List<UserModel> users = userService.listarUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}

