package com.carselling.demo.repository;


import com.carselling.demo.model.MasinaMica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasinaMicaRepo extends JpaRepository<MasinaMica, Long> {
}
