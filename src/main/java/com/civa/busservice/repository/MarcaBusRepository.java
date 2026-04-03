package com.civa.busservice.repository;

import com.civa.busservice.entity.MarcaBus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MarcaBusRepository extends JpaRepository<MarcaBus, Long> {
    Optional<MarcaBus> findByNombre(String nombre);
}
