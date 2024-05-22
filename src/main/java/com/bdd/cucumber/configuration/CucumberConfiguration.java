package com.bdd.cucumber.configuration;

import com.bdd.cucumber.context.CucumberContext;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringConfiguration.class, JpaConfiguration.class, CucumberContext.class})
public class CucumberConfiguration {
}