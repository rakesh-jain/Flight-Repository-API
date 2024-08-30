package com.example.airlineapi.airport.controller;


import com.example.airlineapi.airport.service.AirportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airport")
public class AirportController {
    @Autowired
    private AirportServiceImpl airportService;


    @GetMapping("/airportlist")
    public ResponseEntity<?> getAllAirportList(){
        if(airportService.getListAll()==null){
            return ResponseEntity.badRequest().body("No Data Found");
        }
       return ResponseEntity.ok().body(airportService.getListAll());
    }
    @GetMapping("/airportlist/city/{name}")
    public ResponseEntity<?> getAllByCityName(@PathVariable String name){

        if(airportService.getByCityName(name)==null){
            return ResponseEntity.badRequest().body("Data is Not Available");
        }
        return  ResponseEntity.ok().body(airportService.getByCityName(name));
    }
    @GetMapping("/airportlist/airport/{name}")
    public ResponseEntity<?> getAllByAiportName(@PathVariable String name){
        if(airportService.getByAirportName(name)==null){
            return ResponseEntity.ok().body("looking airport is not there");
        }
        return ResponseEntity.ok().body(airportService.getByAirportName(name));
    }
    @GetMapping("/airportlist/airportcode/{code}")
    public ResponseEntity<?> getAllByAiportCode(@PathVariable String code){
        if(airportService.getByAirportCode(code)==null){
            return ResponseEntity.ok().body("the Code or Looking for data is not Exist");
        }
        return  ResponseEntity.ok().body(airportService.getByAirportCode(code));
    }

}
