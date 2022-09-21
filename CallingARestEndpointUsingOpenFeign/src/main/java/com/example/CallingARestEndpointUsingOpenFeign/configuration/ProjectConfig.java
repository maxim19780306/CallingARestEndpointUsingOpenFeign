package com.example.CallingARestEndpointUsingOpenFeign.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.CallingARestEndpointUsingOpenFeign.proxy")
public class ProjectConfig {
}
