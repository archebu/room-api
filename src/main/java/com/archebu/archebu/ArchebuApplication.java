package com.archebu.archebu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArchebuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchebuApplication.class, args);
    }

}
