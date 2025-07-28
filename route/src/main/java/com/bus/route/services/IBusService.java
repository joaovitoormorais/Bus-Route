package com.bus.route.services;

import com.bus.route.persistence.entities.BusEntity;

import java.util.List;
import java.util.Optional;

public interface IBusService {

    BusEntity save(BusEntity bus);

    List<BusEntity> findAll();

    Optional<BusEntity> findById(Long id);

    BusEntity delete(BusEntity busEntity);
}
