package com.rizwan.banking.dto;


import com.rizwan.banking.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserDto {

    private Integer id;

    @NotNull
    @NotEmpty
    @NotBlank
    private String firstname;

    @NotNull(message = "le nom ne doit pas etre vide")
    @NotEmpty(message = "le nom ne doit pas etre vide")
    @NotBlank(message = "le nom ne doit pas etre vide")
    private String lastname;

    @NotNull
    @NotEmpty
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 8, max = 16)
    private String password;

    @Past
    private LocalDateTime birthdate;

    public static UserDto fromEntity(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public static User toEntity(UserDto user) {
        return User.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
