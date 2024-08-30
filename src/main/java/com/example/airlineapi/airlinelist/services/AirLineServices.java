package com.example.airlineapi.airlinelist.services;



import com.example.airlineapi.airlinelist.entity.AirLines;

import java.util.List;

public interface AirLineServices {
    List<AirLines> getList();
    List<AirLines> getByName(String airline_name);
    List<AirLines> getByCode(String code);
    List<AirLines> isActive(String active);

}
