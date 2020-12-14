package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.SUV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SUVRepo extends JpaRepository<SUV, Long> {
}
