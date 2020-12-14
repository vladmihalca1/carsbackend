package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.Cabrio;
import com.carselling.demo.services.CabrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_cabrio")
public class CabrioController {

    @Autowired
    private CabrioService cabrioService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Cabrio>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cabrioService.getAll());
    }

    @PostMapping("/post")
    public ResponseEntity<Cabrio> post(@RequestBody Cabrio cabrio){
        return cabrioService.post(cabrio);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return cabrioService.delete(id);
    }

}
