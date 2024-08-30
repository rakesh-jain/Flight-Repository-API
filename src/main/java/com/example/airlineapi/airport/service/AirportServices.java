package com.example.airlineapi.airport.service;



import com.example.airlineapi.airport.entity.Airport;

import java.util.List;

public interface AirportServices {
    List<Airport> getListAll();
    List<Airport>getByCityName(String name);
    List<Airport>getByAirportCode(String code);
    List<Airport>getByAirportName(String name);
    List<Airport> getByCityCode(String code);

}
