package com.example.redis.springbootredisdemo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private int id;
    private String name;

}
