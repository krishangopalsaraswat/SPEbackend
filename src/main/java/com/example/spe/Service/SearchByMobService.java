package com.example.spe.Service;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Repositories.SearchByMobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchByMobService {

    @Autowired
    private SearchByMobRepo searchByMobRepo;

    public List<Medicine_details> findByMob(String mobile) {
        return searchByMobRepo.findByMobile(mobile);
    }
}
