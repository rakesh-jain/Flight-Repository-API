package com.example.airlineapi.airlinelist.repository;



import com.example.airlineapi.airlinelist.entity.AirLines;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AirLineRepository extends MongoRepository<AirLines,String> {

    @Query("{'airline_name': ?0}")
    List<AirLines> finByName(String airline_name);

    @Query("{'airline_code': ?0}")
    List<AirLines> findByCode(String airline_code);

    @Query("{'Active': ?0}")
    List<AirLines> isActive(String active);
}
