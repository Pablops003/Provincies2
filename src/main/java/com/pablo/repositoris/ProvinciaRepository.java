package com.pablo.repositoris;

import com.pablo.model.PROVINCIA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinciaRepository extends JpaRepository<PROVINCIA,Long> {
}
