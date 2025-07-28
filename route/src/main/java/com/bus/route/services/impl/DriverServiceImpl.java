package com.bus.route.services.impl;

import com.bus.route.persistence.entities.DriverEntity;
import com.bus.route.persistence.repositories.DriverRepository;
import com.bus.route.services.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements IDriverService {

    private final IDriverService driverService;

    @Autowired
    private DriverRepository driverRepository;

    public DriverServiceImpl(IDriverService driverService) {
        this.driverService = driverService;
    }

    @Override
    public DriverEntity save(DriverEntity driver) {
        return null;
    }

    @Override
    public List<DriverEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<DriverEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public DriverEntity delete(DriverEntity driverEntity) {
        return null;
    }

}
