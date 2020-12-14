package com.carselling.demo.modelMasina;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "masina_sedan")
public class Sedan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //O masina poate sa aiba o singura marca (trebuie creata o tabela cu toate marcile masinii)
    private String marca;

    //O masina are un singul model (trebuie creata o tabela cu toate modelele)
    private String model;
    //Asta poate sa fie optionala => nu toate modelele au o generatie anume
    private String generatie;

    private Integer pret;

    private Integer an_fabricatie;

    private String combustibil;

    private Integer kilometraj;

    private String tara_origine;

    private String stare;

    //kw, cp, capacitate cilindrica
    private String motorizare;

    //clasa
    private String specificatii_caroserie;

    //Aici o lista cu dotari
    private String dotari;

    private String localizare;

}
