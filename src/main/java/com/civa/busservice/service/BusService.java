package com.civa.busservice.service;

import com.civa.busservice.entity.Bus;
import com.civa.busservice.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public Page<Bus> getAllBuses(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return busRepository.findAll(pageable);
    }

    public Bus getBusById(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus no encontrado con id: " + id));
    }
}