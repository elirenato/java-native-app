package com.mycompany;

import com.google.gson.Gson;
import com.mycompany.model.Airport;
import com.mycompany.model.City;
import com.mycompany.model.Country;
import com.mycompany.model.Response;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(new Response("Java Native Hello World with JSON serialization",
                new Airport[]{
                        new
                                Airport(
                                "YVR",
                                new City("Vancouver", new Country("CAN", "Canada"))
                        ),
                        new

                                Airport(
                                "CWB",
                                new City("Curitiba", new Country("BRA", "Brazil"))
                        )
                })));
    }
}
