package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.MasinaOras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasinaOrasRepo extends JpaRepository<MasinaOras, Long> {
}
