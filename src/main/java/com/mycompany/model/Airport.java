package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Airport {
    private String prefix;
    private City city;
}
