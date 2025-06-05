package com.rizwan.banking.dto;


import com.rizwan.banking.models.Transaction;
import com.rizwan.banking.models.TransactionType;
import com.rizwan.banking.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class TransactionDto {

    private Integer id;


    @Positive
    @Max(value = 1000000)
    @Min(value = 10)
    private BigDecimal amount;

    private TransactionType type;

    private String destinationIban;

    private Integer userId;

    public TransactionDto fromTransaction(Transaction transaction) {
        return TransactionDto.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .destinationIban(transaction.getDestinationIban())
                .userId(transaction.getUser().getId())
                .build();
    }
    public Transaction toTransaction(TransactionDto transaction) {
        return Transaction.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .destinationIban(transaction.getDestinationIban())
                .user(
                        User.builder()
                                .id(transaction.getUserId())
                                .build()
                )
                .build();
    }
}
