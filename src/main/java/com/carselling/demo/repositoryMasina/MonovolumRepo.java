package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Monovolum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonovolumRepo extends JpaRepository<Monovolum, Long> {
}
