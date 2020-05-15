package com.alice.service.Impl;

import com.alice.service.ProviderService;

/**
 * dubbo服务接口实现
 */
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String SayHello(String word) {
        return word;
    }
}
