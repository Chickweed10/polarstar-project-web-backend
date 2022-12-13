package com.chickweed.andriod.polarstar.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity //DB 테이블
@NoArgsConstructor //파라미터가 없는 기본 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 만듦
public class Notification implements Serializable {
    @Id //식별자
    @ManyToOne
    @JoinColumn(name="user_phone_number") //외래키 컬럼
    @NotNull //널 허용 X
    private User userPhoneNumber;

    @Column(name = "arrival_status") //컬럼
    @NotNull //널 허용 X
    private boolean arrivalStatus;

    @Column(name = "departure_status") //컬럼
    @NotNull //널 허용 X
    private boolean departureStatus;

    @Column(name = "in_status") //컬럼
    @NotNull //널 허용 X
    private boolean inStatus;

    @Column(name = "out_status") //컬럼
    @NotNull //널 허용 X
    private boolean outStatus;

    @Column(name = "tracking_status") //컬럼
    @NotNull //널 허용 X
    private boolean trackingStatus;
}
