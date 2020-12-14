package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Cabrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabrioRepo extends JpaRepository<Cabrio, Long> {
}
