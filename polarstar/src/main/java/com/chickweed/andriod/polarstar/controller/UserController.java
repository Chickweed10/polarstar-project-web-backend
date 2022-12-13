package com.chickweed.andriod.polarstar.controller;

import com.chickweed.andriod.polarstar.DTO.UserCreateDTO;
import com.chickweed.andriod.polarstar.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin("*")
    @PostMapping("/user/register") //회원가입
    @ResponseBody
    public boolean userRegister(@ModelAttribute final UserCreateDTO userCreateDTO) throws IOException {
        return userService.userCreate(userCreateDTO);
    }

}
