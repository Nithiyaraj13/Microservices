package com.microservices.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;


@Data
@Schema(
        name = "Loans",
        description = "Schema to hold loan information"
)
public class LoansDto {

    @NotEmpty(message = "Mobile Number can't be a null or empty")
    @Pattern(regexp= "(^$[0-9]{10})",message ="Mobile number  should be 10 digits " )
    @Schema(
            description = "MobileNumber of customer", example = "8610231486"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number can't be a null or empty")
    @Pattern(regexp = "(^$[0-9]{12})",message = "LoanNumber must be 12 digits")
    @Schema(
            description = "LoanNumber of customer",example = "548732457654"
    )
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be a null or empty" )
    @Schema(
            description = "Type of Loan",example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    @Schema(
            description = "Total Loan amount",example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total amount paid should be a equal or greater than zero")
    @Schema(
            description = "Total amount paid",example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount  should be equal or greater than zero")
    @Schema(description = "Total outstanding amount",example = "99000")
    private int outstandingAmount;

}
