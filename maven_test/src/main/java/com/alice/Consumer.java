package com.alice;

import com.alice.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main( String[] args ) throws IOException {
        //加载xml配置文件启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        ProviderService service = context.getBean("providerService", ProviderService.class);
        String s = service.SayHello("sss");
        System.out.println(s);
        System.in.read(); // 按任意键退出
    }
}
