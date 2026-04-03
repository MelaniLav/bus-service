package com.civa.busservice.repository;



import com.civa.busservice.entity.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
    Page<Bus> findAll(Pageable pageable);
}