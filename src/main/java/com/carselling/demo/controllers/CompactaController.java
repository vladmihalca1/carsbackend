package com.carselling.demo.controllers;


import com.carselling.demo.modelMasina.Compacta;
import com.carselling.demo.services.CompactaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_compacta")
public class CompactaController {

    @Autowired
    private CompactaService compactaService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Compacta>> getAll(){
        return ResponseEntity.ok(compactaService.getAll());
    }

    @PostMapping("/postCar")
    public ResponseEntity<Compacta> postCar(@RequestBody Compacta compacta){
        //implementarea return compacta e facuta in service
        return compactaService.postCar(compacta);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable(value = "id") Long id){
        compactaService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Masina a fost stearsa cu succes");
    }


}
