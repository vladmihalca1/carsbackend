package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.Sedan;
import com.carselling.demo.services.SedanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_sedan")
public class SedanController {

    @Autowired
    private SedanService sedanService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Sedan>> getAll(){
        return ResponseEntity.ok(sedanService.getAll());
    }

    @PostMapping("/postCar")
    public ResponseEntity<Sedan> postCar(@RequestBody Sedan sedan){
        return sedanService.post(sedan);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return sedanService.delete(id);
    }


}
