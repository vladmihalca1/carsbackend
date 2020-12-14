package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Compacta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompactaRepo extends JpaRepository<Compacta, Long> {
}
