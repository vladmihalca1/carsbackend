package com.carselling.demo.services;


import com.carselling.demo.modelMasina.Coupe;
import com.carselling.demo.repositoryMasina.CoupeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoupeService {
    @Autowired
    private CoupeRepo coupeRepo;

    public List<Coupe> getAll() {
        return coupeRepo.findAll();
    }

    public ResponseEntity<Coupe> post(Coupe coupe) {
        coupeRepo.save(coupe);
        return ResponseEntity.status(HttpStatus.OK)
                .body(coupe);
    }

    public ResponseEntity<String> delete(Long id) {
        coupeRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Masina a fost stearsa cu succes");
    }
}
