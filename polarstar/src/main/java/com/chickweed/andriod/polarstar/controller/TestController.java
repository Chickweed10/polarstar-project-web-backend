package com.chickweed.andriod.polarstar.controller;

import com.chickweed.andriod.polarstar.domain.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

    @GetMapping("/test")
    public Test memberTest(){
        return new Test(0L, "Wickies", 20, "제주", new Date());
    }

    @GetMapping("/test2")
    public ArrayList<Test> memberTest2(){
        return new ArrayList(Arrays.asList(
                new Test(1L, "Wickies", 20, "제주", new Date()),
                new Test(2L, "마동석", 40, "전주", new Date()),
                new Test(3L, "조승우", 22, "무주", new Date()),
                new Test(4L, "박보영", 32, "진주", new Date()),
                new Test(5L, "엄복동", 17, "상주", new Date())
        ));
    }
}
