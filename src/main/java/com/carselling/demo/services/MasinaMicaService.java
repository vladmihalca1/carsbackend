package com.carselling.demo.services;

import com.carselling.demo.modelMasina.MasinaMica;
import com.carselling.demo.repositoryMasina.MasinaMicaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasinaMicaService {

    @Autowired
    private MasinaMicaRepo masinaMicaRepo;

    public List<MasinaMica> getAllMasinaMica() {
        return masinaMicaRepo.findAll();
    }

    public String postMasinaMica(MasinaMica masinaMica) {
        masinaMicaRepo.save(masinaMica);
        return "Masina a fost adaugata";
    }

    public void deleteMasinaMica(Long id) {
        //Optional<MasinaMica> masinaMica = masinaMicaRepo.findById(id);
        //trebuie adaugat exceptie
        masinaMicaRepo.deleteById(id);
    }
}
