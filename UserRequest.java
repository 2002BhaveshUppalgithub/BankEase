package com.baking_sector_api.baking_api.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // or creating objects
public class UserRequest {

    private String firstName;
    private String LastName;
    private String otherName;
    private String gender;
    private String address;
    private String stateOfOrigin;
    private BigDecimal accountBalance;
    private String email;
    private String PhoneNumber;
    private String AlternativeNumber;
}

// first