package com.geekster.UserManagementValidations.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId;

//    @NotNull
    @NotBlank(message = "Name cannot be blank")
//    @NotEmpty
    private String userName;

    @Email(message = "Email Id is invalid")
    private String userEmail;

    @Pattern(regexp = "^(?=.*[@#$%^&+=])(?=.*[A-Z])(?=.*\\d).{6,}$")
    private String password;

    @Size(min = 7, max = 10)
    @Pattern(regexp = "\\d{10}")
    private String userContact;

    @Min(value = 18)
    @Max(value = 30)
    private Integer userAge;
    private LocalDate userDOB; // EX: 2007-12-03
    private Type userType;


}
