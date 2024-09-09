package com.baking_sector_api.baking_api.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryRequest {

    // used to get enquiry how much balance is there in bank
    private String accountNumber;

}
