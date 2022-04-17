package com.example.spe.Controller;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Repositories.SearchByMobRepo;
import com.example.spe.Service.SearchByMobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200/")
public class searchByMobile {

    @Autowired
    private SearchByMobService searchByMobService;

    @GetMapping("/getDonations/{mobile}")
    public List<Medicine_details> search(@PathVariable String mobile){

        return searchByMobService.findByMob(mobile);
    }

}
