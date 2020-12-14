package com.carselling.demo.services;

import com.carselling.demo.modelMasina.MasinaOras;
import com.carselling.demo.repositoryMasina.MasinaOrasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasinaOrasService {

    @Autowired
    private MasinaOrasRepo masinaOrasRepo;

    public List<MasinaOras> getAll() {
        return masinaOrasRepo.findAll();
    }


    public String post(MasinaOras masinaOras) {
        masinaOrasRepo.save(masinaOras);
        return "Masina a fost adaugata cu succes";
    }


    public void delete(Long id) {
        masinaOrasRepo.deleteById(id);
    }
}
