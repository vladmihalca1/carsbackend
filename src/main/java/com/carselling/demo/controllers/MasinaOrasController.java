package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.MasinaOras;
import com.carselling.demo.services.MasinaOrasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_oras")
public class MasinaOrasController {

    @Autowired
    private MasinaOrasService masinaOrasService;

    @GetMapping("/getAll")
    public ResponseEntity<List<MasinaOras>> getAll(){
        return ResponseEntity.ok(masinaOrasService.getAll());
    }

    @PostMapping("/postCar")
    public String postCar(@RequestBody MasinaOras masinaOras){
        return masinaOrasService.post(masinaOras);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        masinaOrasService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Masina a fost stearsa");
    }


}
