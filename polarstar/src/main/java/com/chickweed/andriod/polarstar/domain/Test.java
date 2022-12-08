package com.chickweed.andriod.polarstar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Test {
    private long id;
    private String name;
    private int age;
    private String address;
    private Date createdAt;
}