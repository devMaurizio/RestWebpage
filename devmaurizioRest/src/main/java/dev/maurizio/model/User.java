package dev.maurizio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    private String firstname;
    private String lastname;
    private String age;
    private String postcode;
    private String street;
    private String city;
    private String country;
    private String company;
}
