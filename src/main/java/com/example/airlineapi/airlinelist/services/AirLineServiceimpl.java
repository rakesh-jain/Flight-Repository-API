package com.example.airlineapi.airlinelist.services;


import com.example.airlineapi.airlinelist.entity.AirLines;
import com.example.airlineapi.airlinelist.repository.AirLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirLineServiceimpl implements  AirLineServices {

    @Autowired
    private AirLineRepository airLineRepository;

    @Override
    public List<AirLines> getList() {
        return airLineRepository.findAll();
    }

    @Override
    public List<AirLines> getByName(String airline_name) {
       return airLineRepository.finByName(airline_name);
    }

    @Override
    public List<AirLines> getByCode(String code) {
        return airLineRepository.findByCode(code);
    }

    @Override
    public List<AirLines> isActive(String active) {
        return airLineRepository.isActive(active);
    }
}
