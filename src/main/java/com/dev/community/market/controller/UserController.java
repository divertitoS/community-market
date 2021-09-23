package com.dev.community.market.controller;

import com.dev.community.market.dto.UserResponseDto;
import com.dev.community.market.model.User;
import com.dev.community.market.service.UserService;
import com.dev.community.market.service.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    public UserController(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/by-email")
    public UserResponseDto getByEmail(@RequestParam String email) {
        User user = service.getByEmail(email);
        return mapper.mapToDto(user);
    }

    @GetMapping("/by-phone-number")
    public UserResponseDto getByPhoneNumber(@RequestParam String phoneNumber) {
        User user = service.getByPhoneNumber(phoneNumber);
        return mapper.mapToDto(user);
    }
}
