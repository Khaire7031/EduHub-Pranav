package com.pdk.eduhub.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private Integer userId;

    @NotNull
    private String username;

    @NotNull
    @Size(min = 8, max = 15)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$])[a-zA-Z\\d@#$]{8,15}$", message = "Password must be 8-15 characters long, contain at least one uppercase letter, one lowercase letter, one number, and one special character (@, #, $)")
    private String password;

    @NotNull
    @Email
    @Size(max = 250)
    private String email;
}
