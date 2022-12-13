package com.chickweed.andriod.polarstar.DTO;

import org.springframework.web.multipart.MultipartFile;

public class UserCreateDTO {
    private MultipartFile userProfileImage;
    private UserInfoCreateDTO userInfoCreateDTO;

    public MultipartFile getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(MultipartFile userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public UserInfoCreateDTO getUserInfoCreateDTO() {
        return userInfoCreateDTO;
    }

    public void setUserInfoCreateDTO(UserInfoCreateDTO userInfoCreateDTO) {
        this.userInfoCreateDTO = userInfoCreateDTO;
    }
}
