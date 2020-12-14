package com.carselling.demo.services;

import com.carselling.demo.modelMasina.Sedan;
import com.carselling.demo.repositoryMasina.SedanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedanService {

    @Autowired
    private SedanRepo sedanRepo;

    public List<Sedan> getAll() {
        return sedanRepo.findAll();
    }

    public ResponseEntity<Sedan> post(Sedan sedan) {
        sedanRepo.save(sedan);
        return ResponseEntity.status(HttpStatus.OK).body(sedan);
    }

    public ResponseEntity<String> delete(Long id) {
        sedanRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Masina a fost stearsa cu succes");
    }
}
