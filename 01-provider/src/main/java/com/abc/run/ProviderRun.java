package com.abc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 当前方式是不提供的，看01-provider2 的Main.main
 */
public class ProviderRun {
    public static void main(String[] args) throws IOException {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-provider.xml");
        // 启动Spring容器
        ((ClassPathXmlApplicationContext) ac).start();
        // 使主线程阻塞
        System.in.read();
    }
}
