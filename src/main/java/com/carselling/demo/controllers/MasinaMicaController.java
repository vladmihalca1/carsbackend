package com.carselling.demo.controllers;

import com.carselling.demo.model.MasinaMica;
import com.carselling.demo.services.MasinaMicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masina_mica")
public class MasinaMicaController {

    @Autowired
    private MasinaMicaService masinaMicaService;

    @GetMapping("/getAll")
    public List<MasinaMica> getAllMasinaMica(){
        return masinaMicaService.getAllMasinaMica();
    }

    @PostMapping("/postCar")
    public String postMasinaMica(@RequestBody MasinaMica masinaMica){
        return masinaMicaService.postMasinaMica(masinaMica);
    }


}
