package com.javatechie.validation.example.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {

    @NotNull(message = "username should not be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp="%%&&*@@",message = "invalid mobile number added")
    private String mobile;
    private String gender;
    @NotBlank
    private String nationality;
    @Min(18)
    @Max(60)
    private int age;
}
