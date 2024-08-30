package com.example.airlineapi.airlinelist.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airline_list")
public class AirLines {
    @Id
    private String id;
    private int Markup;
    private String Active;
    private int airline_id;
    private String ProviderType ;

    private String airline_code;
    private String airline_name;
    private String airline_helpline_no;
    private String airline_helpline_email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarkup() {
        return Markup;
    }

    public void setMarkup(int markup) {
        Markup = markup;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public int getAirline_id() {
        return airline_id;
    }

    public void setAirline_id(int airline_id) {
        this.airline_id = airline_id;
    }

    public String getProviderType() {
        return ProviderType;
    }

    public void setProviderType(String providerType) {
        ProviderType = providerType;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getAirline_helpline_no() {
        return airline_helpline_no;
    }

    public void setAirline_helpline_no(String airline_helpline_no) {
        this.airline_helpline_no = airline_helpline_no;
    }

    public String getAirline_helpline_email() {
        return airline_helpline_email;
    }

    public void setAirline_helpline_email(String airline_helpline_email) {
        this.airline_helpline_email = airline_helpline_email;
    }
}
