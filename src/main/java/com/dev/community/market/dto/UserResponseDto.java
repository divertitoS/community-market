package com.dev.community.market.dto;

import lombok.Data;

@Data
public class UserResponseDto {

    private Long id;

    private String firstName;

    private String secondName;

    private String phoneNumber;

    private String email;
}
