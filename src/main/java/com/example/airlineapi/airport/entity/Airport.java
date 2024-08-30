package com.example.airlineapi.airport.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airport_list")
public class Airport {
    private int airport_id;
    private String airport_lat;
    private String  airport_lon;
    private  String airport_city;
    private String airport_code;

    private String airport_name;

    private String airport_timezone;

    private String airport_city_code;

    private String airport_city_name;

     private String airport_country_code;

    private String airport_country_name;
    private String airport_num_airports;

    public int getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(int airport_id) {
        this.airport_id = airport_id;
    }

    public String getAirport_lat() {
        return airport_lat;
    }

    public void setAirport_lat(String airport_lat) {
        this.airport_lat = airport_lat;
    }

    public String getAirport_lon() {
        return airport_lon;
    }

    public void setAirport_lon(String airport_lon) {
        this.airport_lon = airport_lon;
    }

    public String getAirport_city() {
        return airport_city;
    }

    public void setAirport_city(String airport_city) {
        this.airport_city = airport_city;
    }

    public String getAirport_code() {
        return airport_code;
    }

    public void setAirport_code(String airport_code) {
        this.airport_code = airport_code;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getAirport_timezone() {
        return airport_timezone;
    }

    public void setAirport_timezone(String airport_timezone) {
        this.airport_timezone = airport_timezone;
    }

    public String getAirport_city_code() {
        return airport_city_code;
    }

    public void setAirport_city_code(String airport_city_code) {
        this.airport_city_code = airport_city_code;
    }

    public String getAirport_city_name() {
        return airport_city_name;
    }

    public void setAirport_city_name(String airport_city_name) {
        this.airport_city_name = airport_city_name;
    }

    public String getAirport_country_code() {
        return airport_country_code;
    }

    public void setAirport_country_code(String airport_country_code) {
        this.airport_country_code = airport_country_code;
    }

    public String getAirport_country_name() {
        return airport_country_name;
    }

    public void setAirport_country_name(String airport_country_name) {
        this.airport_country_name = airport_country_name;
    }

    public String getAirport_num_airports() {
        return airport_num_airports;
    }

    public void setAirport_num_airports(String airport_num_airports) {
        this.airport_num_airports = airport_num_airports;
    }
}
