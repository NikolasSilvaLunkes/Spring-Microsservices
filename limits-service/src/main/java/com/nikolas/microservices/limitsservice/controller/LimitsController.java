package com.nikolas.microservices.limitsservice.controller;

import com.nikolas.microservices.limitsservice.bean.Limits;
import com.nikolas.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMaximum(), configuration.getMinimum());
    }

}
