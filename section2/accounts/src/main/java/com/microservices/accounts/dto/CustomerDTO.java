package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Custoemr",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDTO {

    @Schema(
            description = "Name of the Customer",example ="Nithiyaraj"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max=30,message = "The length of customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the Customer",example = "nithiyarajbtech@gmail.com"
    )
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email address should be a vaild value ")
    private String email;

    @Schema(
            description = "Mobile number of the Customer",example = "8610231485"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDTO accountsDTO;
}
