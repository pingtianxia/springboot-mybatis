package com.hyp.dubbo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.hyp.dubbo.provider.dao")
public class HypDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HypDubboProviderApplication.class, args);
    }
}
