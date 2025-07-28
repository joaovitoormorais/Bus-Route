package com.bus.route.services;

import com.bus.route.persistence.entities.RouteEntity;

import java.util.List;

public interface IRouteService {

    RouteEntity save(RouteEntity route);

    List<RouteEntity> findById(Long id);

    RouteEntity update(Long id, RouteEntity updatedRoute);

    RouteEntity delete(RouteEntity route);

    List<RouteEntity> findByDestiny(String destiny);

    List<RouteEntity> findByDriver(Long idDriver);

    List<RouteEntity> findByBus(Long idBus);
}
