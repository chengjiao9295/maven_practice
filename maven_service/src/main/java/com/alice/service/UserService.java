package com.alice.service;

import com.alice.dao.User;

import java.util.List;

public interface UserService {
    public List<User> findById(Integer id);
}
