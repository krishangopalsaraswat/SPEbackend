package com.example.spe.Repositories;

import com.example.spe.Entities.Medicine_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Medicine_details_repo extends JpaRepository<Medicine_details,Integer> {

    java.util.List<Medicine_details> findByMedicineNameContainingIgnoreCase(@Param("name") String name);

    List<Medicine_details> findByMedicineDomainContainingIgnoreCase(@Param("domain") String domain);


}
