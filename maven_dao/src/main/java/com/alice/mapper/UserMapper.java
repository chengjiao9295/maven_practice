package com.alice.mapper;

import com.alice.dao.User;

import java.util.List;

public interface UserMapper {
    List<User> findById(Integer id);
}
