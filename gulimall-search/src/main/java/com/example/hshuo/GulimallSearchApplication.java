package com.example.hshuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author SHshuo
 * @data 2023/3/3--16:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallSearchApplication.class, args);
    }
}
