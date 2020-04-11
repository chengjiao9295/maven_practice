package com.alice.service.Impl;

import com.alice.dao.User;
import com.alice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    public List<User> findById(Integer id) {
        return null;
    }
}
