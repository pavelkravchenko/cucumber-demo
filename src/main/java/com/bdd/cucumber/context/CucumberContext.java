package com.bdd.cucumber.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
//use this class to store test data, test result to share it between steps. Define field you need.
public class CucumberContext {
}