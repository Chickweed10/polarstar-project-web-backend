package com.chickweed.andriod.polarstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @CrossOrigin("*")
    @GetMapping("/") //ESL 조회
    @ResponseBody
    public String index() {
        return "Hello!";
    }
}
