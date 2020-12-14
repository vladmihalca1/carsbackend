package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.MasinaMica;
import com.carselling.demo.services.MasinaMicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_mica")
public class MasinaMicaController {

    @Autowired
    private MasinaMicaService masinaMicaService;

    @GetMapping("/getAll")
    public ResponseEntity<List<MasinaMica>> getAllMasinaMica(){
        return ResponseEntity.ok(masinaMicaService.getAllMasinaMica());
    }

    @PostMapping("/postCar")
    public String postMasinaMica(@RequestBody MasinaMica masinaMica){
        return masinaMicaService.postMasinaMica(masinaMica);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMasinaMica(@PathVariable(value = "id") Long id){
        masinaMicaService.deleteMasinaMica(id);
        return ResponseEntity.status(HttpStatus.OK).body("Masina a fost stearsa");
    }


}
