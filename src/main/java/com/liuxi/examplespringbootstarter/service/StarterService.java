package com.liuxi.examplespringbootstarter.service;

import org.springframework.util.StringUtils;

public class StarterService {

    private String config;

    public StarterService(String config){
        this.config = config;
    }

    public String[] split(String splitStr){

        return StringUtils.split(config,splitStr);

    }
}
