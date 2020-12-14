package com.carselling.demo.controllers;

import com.carselling.demo.modelMasina.SUV;
import com.carselling.demo.services.SUVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_suv")
public class SUVController {

    @Autowired
    private SUVService suvService;

    @GetMapping("/getAll")
    public ResponseEntity<List<SUV>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(suvService.getAll());
    }

    @PostMapping("/post")
    public ResponseEntity<SUV> post(@RequestBody SUV suv){
        return suvService.post(suv);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return suvService.delete(id);
    }


}
