package org.example.carlisting.Cars;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("secret")
public record AzureConfigurationProperties(String containerName, String connectStr) {
}
