package com.carselling.demo.repositoryMasina;


import com.carselling.demo.modelMasina.MasinaMica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasinaMicaRepo extends JpaRepository<MasinaMica, Long> {
}
