package com.bdd.cucumber.repositories;

import com.bdd.cucumber.pojo.Pojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PojoRepository extends JpaRepository<Pojo, Integer> {
}