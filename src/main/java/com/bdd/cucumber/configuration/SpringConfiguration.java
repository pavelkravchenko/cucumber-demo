package com.bdd.cucumber.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bdd.cucumber.services")
public class SpringConfiguration {
}