package com.example.spe.Service;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Repositories.Medicine_details_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Medicine_details_service {

    @Autowired
    private Medicine_details_repo medicine_details_repo;

    public Medicine_details save_medicine_details(Medicine_details medicine_details) {
        return medicine_details_repo.save(medicine_details);
    }

    public List<Medicine_details> getMedicineByName(String name) {
        return medicine_details_repo.findByMedicineNameContainingIgnoreCase(name);
    }

    public List<Medicine_details> getMedicineBymedicineDomain(String domain) {
        return medicine_details_repo.findByMedicineDomainContainingIgnoreCase(domain);
    }

    public List<Medicine_details> getProducts() {
        return medicine_details_repo.findAll();
    }
}
