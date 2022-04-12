package com.example.spe.Controller;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Entities.signup;
import com.example.spe.Service.signup_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class signup_controller {

    @Autowired
    private signup_service signupService;

    @PostMapping("/signup")
    public signup adduserDetails(@RequestBody signup userDetails){

        return signupService.adduser(userDetails);
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody signup userDetails){
//        if(signupService.findbyusername(userDetails))
//            return ResponseEntity.ok("User login successfully");
//        else
//            return ResponseEntity.badRequest().body("Bad credentials");
//    }

    @PostMapping("/login")
    public boolean loginuser(@RequestBody signup userdetails){

        return signupService.finduser(userdetails);
    }



//    @GetMapping("/userDetails/{userName}")
//    public signup getuserName(@PathVariable String userName) {
//        System.out.println("************");
//        return signupService.findusername(userName);
//
//    }

}
