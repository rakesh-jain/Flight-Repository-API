package com.example.airlineapi.airlinelist.controller;


import com.example.airlineapi.airlinelist.services.AirLineServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airline")
public class AirLineController {
    @Autowired
    private AirLineServiceimpl airLineServiceimpl;
    @GetMapping("/airlinelist")
    public ResponseEntity<?> getAllList(){
        if(airLineServiceimpl.getList()==null){
            return ResponseEntity.badRequest().body("there is no data available");
        }
        return ResponseEntity.ok().body(airLineServiceimpl.getList());
    }
    @GetMapping("/airlinelist/airlinename/{airline_name}")
    public ResponseEntity<?> getByName(@PathVariable String airline_name){
        if(airLineServiceimpl.getByName(airline_name)==null){
            return ResponseEntity.badRequest().body("data You are accessing is doesn't exist ");
        }
        return ResponseEntity.ok().body(airLineServiceimpl.getByName(airline_name));
    }
    @GetMapping("/airlinelist/{airline_code}")
    public ResponseEntity<?> getByCode(@PathVariable String airline_code){
        if(airLineServiceimpl.getByCode(airline_code)==null){
            return ResponseEntity.badRequest().body("data you are accessing is doesn't exist");
        }
        return ResponseEntity.ok().body(airLineServiceimpl.getByCode(airline_code));
    }
    @GetMapping("/airlinelist/active/{active}")
    public ResponseEntity<?> isActive(@PathVariable String active){
        return ResponseEntity.ok().body(airLineServiceimpl.isActive(active));
    }
}
