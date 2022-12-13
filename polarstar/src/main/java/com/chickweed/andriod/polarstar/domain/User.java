package com.chickweed.andriod.polarstar.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity //DB 테이블
@Inheritance(strategy = InheritanceType.JOINED) //상속 전략
@DiscriminatorColumn(name="DTYPE") //구분 칼럼
@NoArgsConstructor //파라미터가 없는 기본 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 만듦
public class User {
    @Id //식별자
    @Column(name = "user_phone_number") //컬럼
    @NotNull //널 허용 X
    private String userPhoneNumber;

    @Column(name = "user_password", length = 200) //컬럼
    @NotNull //널 허용 X
    private String userPassword;

    @Column(name = "user_profile_image", length = 5000) //컬럼
    private String userProfileImage;

    @Column(name = "user_name", length = 20) //컬럼
    @NotNull //널 허용 X
    private String userName;

    @Column(name = "user_birth", length = 200) //컬럼
    @NotNull //널 허용 X
    private String userBirth;

    @Column(name = "user_sex", length = 20) //컬럼
    @NotNull //널 허용 X
    private String userSex;

    @Column(name = "user_address", length = 200) //컬럼
    @NotNull //널 허용 X
    private String userAddress;

    @Column(name = "user_detail_address", length = 200) //컬럼
    @NotNull //널 허용 X
    private String userDetailAddress;

    @Column(name = "user_connection_code") //컬럼
    @NotNull //널 허용 X
    private String userConnectionCode;
}
