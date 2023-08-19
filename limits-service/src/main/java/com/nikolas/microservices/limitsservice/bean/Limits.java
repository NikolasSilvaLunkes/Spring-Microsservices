package com.nikolas.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Limits {
    private int maximum;

    private int minimum;
}
