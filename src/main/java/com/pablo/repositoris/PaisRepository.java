package com.pablo.repositoris;

import com.pablo.model.PAIS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends JpaRepository<PAIS, Long> {
}
