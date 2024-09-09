package com.baking_sector_api.baking_api.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferRequest {

    private String sourceAccountNumber;  // from which we have to debit money
    private String destinationAccountNumber; // to which we debit
    private BigDecimal amount;


}


// this dto class is used to transfer money from one person
// account and transfer is to other person account