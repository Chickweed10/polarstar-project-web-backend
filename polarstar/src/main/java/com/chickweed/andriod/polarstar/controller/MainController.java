package com.chickweed.andriod.polarstar.controller;

import com.chickweed.andriod.polarstar.DTO.UserCreateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }
}
