package com.carselling.demo.services;

import com.carselling.demo.modelMasina.Cabrio;
import com.carselling.demo.repositoryMasina.CabrioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabrioService {

    @Autowired
    private CabrioRepo cabrioRepo;

    public List<Cabrio> getAll() {
        return cabrioRepo.findAll();
    }

    public ResponseEntity<Cabrio> post(Cabrio cabrio) {
        cabrioRepo.save(cabrio);
        return ResponseEntity.status(HttpStatus.OK)
                .body(cabrio);
    }

    public ResponseEntity<String> delete(Long id) {
        cabrioRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Masina a fost stearsa cu succes");
    }
}
