package com.bus.route.services;

import com.bus.route.persistence.entities.DriverEntity;

import java.util.List;
import java.util.Optional;

public interface IDriverService {

    DriverEntity save(DriverEntity driver);

    List<DriverEntity> findAll();

    Optional<DriverEntity> findById(Long id);

    DriverEntity delete(DriverEntity driverEntity);
}
