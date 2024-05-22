package com.bdd.cucumber.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "table_name")
@Data
public class Pojo {
    @Id
    private Integer id;
    private Integer name;
    private Integer age;
}