package dev.maurizio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    private String age;
    @NotNull
    private String postcode;
    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
    private String company;
}
