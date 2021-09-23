package com.dev.community.market.dao;

import com.dev.community.market.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User getByEmail(String email);

    User getByPhoneNumber(String phoneNumber);
}
