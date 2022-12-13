package com.chickweed.andriod.polarstar.service.serviceInterface;

import com.chickweed.andriod.polarstar.DTO.UserCreateDTO;

import java.io.IOException;

public interface UserService {
    boolean userCreate(UserCreateDTO userCreateDTO) throws IOException; //사용자 회원가입
}
