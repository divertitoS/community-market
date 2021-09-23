package com.dev.community.market.service.mapper;

import com.dev.community.market.dto.UserRequestDto;
import com.dev.community.market.dto.UserResponseDto;
import com.dev.community.market.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements RequestDtoMapper<UserRequestDto, User>,
                                   ResponseDtoMapper<UserResponseDto, User> {

    @Override
    public User mapToModel(UserRequestDto dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setFirstName(dto.getFirstName());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setSecondName(dto.getSecondName());
        return user;
    }

    @Override
    public UserResponseDto mapToDto(User model) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(model.getId());
        dto.setEmail(model.getEmail());
        dto.setFirstName(model.getFirstName());
        dto.setSecondName(model.getSecondName());
        dto.setPhoneNumber(model.getPhoneNumber());
        return dto;
    }
}
