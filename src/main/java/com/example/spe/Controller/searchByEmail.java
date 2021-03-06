package com.example.spe.Controller;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Service.SearchByEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200/")
public class searchByEmail {

    @Autowired
    private SearchByEmailService searchByEmailService;

    @GetMapping("/getDonations/{useremail}")
    public List<Medicine_details> search(@PathVariable String useremail){

        return searchByEmailService.findByuserEmail(useremail);
    }

}
