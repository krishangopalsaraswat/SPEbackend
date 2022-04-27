package com.example.spe.Service;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Entities.signup;
import com.example.spe.Repositories.signup_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class signup_service {

    @Autowired
    private signup_repo signupRepo;

    public signup adduser(signup userDetails) {
        return signupRepo.save(userDetails);
    }

//    public boolean findbyusername(signup userDetails) {
//        List<signup> userList=signupRepo.findByUsername(userDetails.getUsername());
//        if(userList.size()==0 || !userList.get(0).getPassword().equals(userDetails.getPassword()))
//            return false;
//        else
//            return true;
//    }


    public List<signup> finduser(signup userdetails) {

        return signupRepo.findByUsername(userdetails.getUsername());
    }


//    public signup findusername(String userName) {
//        return signupRepo.findByUsername(userName);
//    }




}



















