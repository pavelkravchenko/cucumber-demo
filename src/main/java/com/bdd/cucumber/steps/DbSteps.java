package com.bdd.cucumber.steps;

import com.bdd.cucumber.repositories.PojoRepository;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class DbSteps extends StepDefinitions {
    @Autowired
    private PojoRepository pojoRepository;

    @Then("Test sql query {int}")
    public void test(int id) {
        Assertions.assertThat(pojoRepository.findById(id)).as("Failed").isNotEmpty();
    }
}