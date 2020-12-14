package com.carselling.demo.services;

import com.carselling.demo.modelMasina.Compacta;
import com.carselling.demo.repositoryMasina.CompactaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompactaService {

    @Autowired
    private CompactaRepo compactaRepo;

    public List<Compacta> getAll() {
        return compactaRepo.findAll();
    }

    public ResponseEntity<Compacta> postCar(Compacta compacta) {
        compactaRepo.save(compacta);
        return ResponseEntity.ok(compacta);
    }

    public void delete(Long id) {
        compactaRepo.deleteById(id);
    }
}
