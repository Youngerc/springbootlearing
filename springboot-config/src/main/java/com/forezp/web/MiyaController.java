package com.forezp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @GetMapping("miya")
    public String miya() {
        return name + ":" + age;
    }
}
