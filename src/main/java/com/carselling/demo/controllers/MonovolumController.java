package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.Monovolum;
import com.carselling.demo.services.MonovolumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_monovolum")
public class MonovolumController {

    @Autowired
    private MonovolumService monovolumService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Monovolum>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(monovolumService.getAll());
    }

    @PostMapping("/post")
    public ResponseEntity<Monovolum> post(@RequestBody Monovolum monovolum){
        return monovolumService.post(monovolum);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return monovolumService.delete(id);
    }

}
