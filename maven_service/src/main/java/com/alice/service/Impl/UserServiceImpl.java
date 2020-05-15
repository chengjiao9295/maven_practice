package com.alice.service.Impl;

import com.alice.service.ProviderService;
import com.alice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public ProviderService providerService;

    public String SayHello(String word){
        return providerService.SayHello(word);
    }
}
