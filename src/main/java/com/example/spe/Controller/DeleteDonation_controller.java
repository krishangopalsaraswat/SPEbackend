package com.example.spe.Controller;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Entities.signup;
import com.example.spe.Service.DelDon_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class DeleteDonation_controller{
    @Autowired
    public DelDon_Service delDon_service;

//    @PostMapping("/deleteById")
//    public boolean deleteById(@RequestBody Integer id){
//
//        return delDon_service.delete(id);
//    }

        @GetMapping("/deleteById/{id}")
        public boolean deleteById(@PathVariable int id)
            {
            return delDon_service.delete(id);
        }
    }


