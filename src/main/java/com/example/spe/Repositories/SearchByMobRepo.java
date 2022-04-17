package com.example.spe.Repositories;

import com.example.spe.Entities.Medicine_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SearchByMobRepo extends JpaRepository<Medicine_details,Integer> {

//    @Query("SELECT u FROM Medicine_details u WHERE u.mobile = mobile")
    List<Medicine_details> findByMobile(@Param("mobile") String mobile);

}
