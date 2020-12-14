package com.carselling.demo.services;

import com.carselling.demo.modelMasina.Monovolum;
import com.carselling.demo.repositoryMasina.MonovolumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonovolumService {

    @Autowired
    private MonovolumRepo monovolumRepo;

    public List<Monovolum> getAll() {
        return monovolumRepo.findAll();
    }

    public ResponseEntity<Monovolum> post(Monovolum monovolum) {
        monovolumRepo.save(monovolum);
        return ResponseEntity.status(HttpStatus.OK)
                .body(monovolum);
    }

    public ResponseEntity<String> delete(Long id) {
        monovolumRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Masina a fost stearsa cu succes");
    }
}
