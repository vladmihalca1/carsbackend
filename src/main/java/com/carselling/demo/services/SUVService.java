package com.carselling.demo.services;


import com.carselling.demo.modelMasina.SUV;
import com.carselling.demo.repositoryMasina.SUVRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SUVService {

    @Autowired
    private SUVRepo suvRepo;

    public List<SUV> getAll() {
        return suvRepo.findAll();
    }

    public ResponseEntity<SUV> post(SUV suv) {
        suvRepo.save(suv);
        return ResponseEntity.status(HttpStatus.OK)
                .body(suv);
    }

    public ResponseEntity<String> delete(Long id) {
        suvRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Masina a fost stearsa cu succes");
    }
}
