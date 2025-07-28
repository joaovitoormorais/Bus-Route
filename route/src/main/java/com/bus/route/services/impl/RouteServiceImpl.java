package com.bus.route.services.impl;

import com.bus.route.persistence.entities.RouteEntity;
import com.bus.route.persistence.repositories.BusRepository;
import com.bus.route.persistence.repositories.DriverRepository;
import com.bus.route.persistence.repositories.RouteRepository;
import com.bus.route.services.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements IRouteService {

    private final IRouteService routeService;

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private RouteRepository routeRepository;

    public RouteServiceImpl(IRouteService routeService) {
        this.routeService = routeService;
    }

    @Override
    public RouteEntity save(RouteEntity route) {
        return null;
    }

    @Override
    public List<RouteEntity> findById(Long id) {
        return List.of();
    }

    @Override
    public RouteEntity update(Long id, RouteEntity updatedRoute) {
        return null;
    }

    @Override
    public RouteEntity delete(RouteEntity route) {
        return null;
    }

    @Override
    public List<RouteEntity> findByDestiny(String destiny) {
        return List.of();
    }

    @Override
    public List<RouteEntity> findByDriver(Long idDriver) {
        return List.of();
    }

    @Override
    public List<RouteEntity> findByBus(Long idBus) {
        return List.of();
    }

}
