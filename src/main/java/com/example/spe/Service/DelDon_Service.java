package com.example.spe.Service;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Repositories.Del_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelDon_Service {

    @Autowired
    public Del_Repo del_repo;

    public boolean delete(int id) {
        del_repo.deleteById(id);
        return true;
    }
//    List<Medicine_details>
}
