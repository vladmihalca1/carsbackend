package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Sedan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedanRepo extends JpaRepository<Sedan,Long> {
}
