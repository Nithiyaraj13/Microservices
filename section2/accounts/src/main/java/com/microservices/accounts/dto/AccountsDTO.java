package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDTO {

    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Eazy Bank account",example = "1234543212"
    )
    private Long accountNumber;


    @NotEmpty(message = "Account type can not be a null or empty")
    @Schema(
            description = "Account type of Eazy Bank Account",example = "Savings"
    )
    private String accountType;


    @NotEmpty(message="Branch Address can not be a null or empty")
    @Schema(
            description = "Eazy bank branch address"
    )
    private String branchAddress;
}
