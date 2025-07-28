package com.bus.route.services.impl;

import com.bus.route.persistence.entities.BusEntity;
import com.bus.route.persistence.repositories.BusRepository;
import com.bus.route.services.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusServiceImpl implements IBusService {

    private final IBusService busService;

    @Autowired
    private BusRepository busRepository;

    public BusServiceImpl(IBusService busService) {
        this.busService = busService;
    }

    @Override
    public BusEntity save(BusEntity bus) {
        return null;
    }

    @Override
    public List<BusEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<BusEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public BusEntity delete(BusEntity busEntity) {
        return null;
    }

}
