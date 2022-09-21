package com.example.CallingARestEndpointUsingOpenFeign.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
    private String id;
    private String amount;
}
