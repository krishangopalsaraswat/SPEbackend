package com.example.spe.Service;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Repositories.SearchByEmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchByEmailService {

    @Autowired
    private SearchByEmailRepo searchByMobRepo;

    public List<Medicine_details> findByuserEmail(String mobile) {
        return searchByMobRepo.findByUserEmail(mobile);
    }
}
