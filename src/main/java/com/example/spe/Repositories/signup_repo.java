package com.example.spe.Repositories;

import com.example.spe.Entities.signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface signup_repo extends JpaRepository<signup,Integer> {
    List<signup> findByUsername(String userName);
}
