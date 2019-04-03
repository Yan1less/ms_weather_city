package com.microweather.mvn_city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MvnCityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvnCityApplication.class, args);
    }

}
