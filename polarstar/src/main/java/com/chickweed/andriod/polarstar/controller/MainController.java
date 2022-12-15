package com.chickweed.andriod.polarstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @CrossOrigin("*")
    @GetMapping("/")
    @ResponseBody
    public String mainIndex() {
        return "Hello!";
    }
    @CrossOrigin("*")
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }
}
