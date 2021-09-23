package com.dev.community.market.service.impl;

import com.dev.community.market.model.User;
import com.dev.community.market.dao.UserDao;
import org.springframework.stereotype.Service;
import com.dev.community.market.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User save(User user) {
        return dao.save(user);
    }

    @Override
    public User getByEmail(String email) {
        return dao.getByEmail(email);
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return dao.getByPhoneNumber(phoneNumber);
    }
}
