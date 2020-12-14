package com.carselling.demo.services;

import com.carselling.demo.modelMasina.Combi;
import com.carselling.demo.repositoryMasina.CombiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombiService {

    @Autowired
    private CombiRepo combiRepo;

    public List<Combi> getAll() {
        return combiRepo.findAll();
    }

    public ResponseEntity<Combi> post(Combi combi) {
        combiRepo.save(combi);
        return ResponseEntity.status(HttpStatus.OK).body(combi);
    }

    public ResponseEntity<String> delete(Long id) {
        combiRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Masina a fost stearsa cu succes");
    }
}
