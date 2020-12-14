package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.Combi;
import com.carselling.demo.services.CombiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/masina_combi")
public class CombiController {

    @Autowired
    private CombiService combiService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Combi>> getAll(){
        return ResponseEntity.ok(combiService.getAll());
    }

    @PostMapping("/post")
    public ResponseEntity<Combi> post(@RequestBody Combi combi){
        return combiService.post(combi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return combiService.delete(id);
    }



}
