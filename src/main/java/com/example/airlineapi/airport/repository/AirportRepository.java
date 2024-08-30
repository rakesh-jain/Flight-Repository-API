package com.example.airlineapi.airport.repository;


import com.example.airlineapi.airport.entity.Airport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AirportRepository extends MongoRepository<Airport,String> {

    @Query("{'airport_city_name': ?0}")
    List<Airport> findByCityName(String name);

    @Query("{'airport_code': ?0}")
    List<Airport> findAirportCode(String code);

    @Query("{'airport_name': ?0}")
    List<Airport> findByAirportName(String name);

    @Query("{'airport_city_code': ?0}")
    List<Airport> findByCityCode(String code);

}
