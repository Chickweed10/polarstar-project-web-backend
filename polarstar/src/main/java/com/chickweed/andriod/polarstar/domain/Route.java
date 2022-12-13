package com.chickweed.andriod.polarstar.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity //DB 테이블
@NoArgsConstructor //파라미터가 없는 기본 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 만듦
public class Route {
    @Id //식별자
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID값 자동으로 올라가게 설정
    @Column(name="route_id", length = 10000) //컬럼
    private Long routeID;

    @ManyToOne
    @JoinColumn(name="user_phone_number") //외래키 컬럼
    @NotNull //널 허용 X
    private User userPhoneNumber;

    @Column(name = "route_date", length = 200) //컬럼
    @NotNull //널 허용 X
    private LocalDateTime routeDate;

    @Column(name = "route_latitude", length = 2000) //컬럼
    @NotNull //널 허용 X
    private Double routeLatitude;

    @Column(name = "route_longitude", length = 2000) //컬럼
    @NotNull //널 허용 X
    private Double routeLongitude;
}
