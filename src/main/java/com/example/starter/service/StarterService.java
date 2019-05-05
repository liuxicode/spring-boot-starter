package com.example.starter.service;

import org.springframework.util.StringUtils;

public class StarterService {

    private String config;

    public StarterService(String config){
        this.config = config;
    }

    public String[] split(String splitStr){

        return config != null ? config.split(splitStr) : new String[]{};

    }
}
