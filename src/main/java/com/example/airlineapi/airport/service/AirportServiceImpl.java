package com.example.airlineapi.airport.service;



import com.example.airlineapi.airport.entity.Airport;
import com.example.airlineapi.airport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportServices {
    @Autowired
    private AirportRepository airportRepository;
    @Override
    public List<Airport> getListAll() {
        return airportRepository.findAll();
    }

    @Override
    public List<Airport> getByCityName(String name) {
        return airportRepository.findByCityName(name);
    }

    @Override
    public List<Airport> getByAirportCode(String code) {
        return airportRepository.findAirportCode(code);
    }

    @Override
    public List<Airport> getByAirportName(String name) {
        return airportRepository.findByAirportName(name);
    }

    @Override
    public List<Airport> getByCityCode(String code) {
        return airportRepository.findByCityCode(code);
    }
}
