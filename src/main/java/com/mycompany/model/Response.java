package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response {
    private String message;
    private Airport[] airports;
}
