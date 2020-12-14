package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.Coupe;
import com.carselling.demo.services.CoupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_coupe")
public class CoupeController {

    @Autowired
    private CoupeService coupeService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Coupe>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(coupeService.getAll());
    }

    @PostMapping("/post")
    public ResponseEntity<Coupe> post(@RequestBody Coupe coupe){
        return coupeService.post(coupe);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return coupeService.delete(id);
    }

}
