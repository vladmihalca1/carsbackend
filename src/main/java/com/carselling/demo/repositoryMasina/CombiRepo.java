package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Combi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombiRepo extends JpaRepository<Combi, Long> {
}
