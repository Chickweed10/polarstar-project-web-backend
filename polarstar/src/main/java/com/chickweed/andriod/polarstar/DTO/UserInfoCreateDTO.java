package com.chickweed.andriod.polarstar.DTO;

import com.sun.istack.NotNull;

import javax.persistence.Column;

public class UserInfoCreateDTO {
    private int userClassification; //사용자 구별 (0: 기본값, 1: 피보호자, 2: 보호자)
    private String userPhoneNumber;
    private String userPassword;
    private String userName;
    private String userBirth;
    private String userSex;
    private String userAddress;
    private String userDetailAddress;
    private String userConnectionCode; //사용자 연결 코드

    public int getUserClassification() {
        return userClassification;
    }

    public void setUserClassification(int userClassification) {
        this.userClassification = userClassification;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDetailAddress() {
        return userDetailAddress;
    }

    public void setUserDetailAddress(String userDetailAddress) {
        this.userDetailAddress = userDetailAddress;
    }

    public String getUserConnectionCode() {
        return userConnectionCode;
    }

    public void setUserConnectionCode(String userConnectionCode) {
        this.userConnectionCode = userConnectionCode;
    }
}
