package com.carselling.demo.repositoryMasina;

import com.carselling.demo.modelMasina.Coupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoupeRepo extends JpaRepository<Coupe, Long> {
}
