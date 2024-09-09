package com.baking_sector_api.baking_api.Dto;
import lombok.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TransactionDto
{
      private String transactionType;
      private BigDecimal amount;
      private String accountNumber;
      private String status;
}
