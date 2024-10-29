package org.example.carlisting;

import org.example.carlisting.Cars.AzureConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AzureConfigurationProperties.class)
public class CarListingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarListingApplication.class, args);
    }

}
