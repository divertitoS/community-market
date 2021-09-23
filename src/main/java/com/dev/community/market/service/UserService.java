package com.dev.community.market.service;

import com.dev.community.market.model.User;

public interface UserService {
    User save(User user);

    User getByEmail(String email);

    User getByPhoneNumber(String phoneNumber);
}
