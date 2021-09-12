package com.sparta.myselectshop.models;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Product : 관심 상품 테이블
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class Product extends Timestamped{

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String title; // Apple 아이폰 11 128G [자급제]

    @Column(nullable = false)
    private String image; // 아이폰 사진

    @Column(nullable = false)
    private String link; //

    @Column(nullable = false)
    private int lprice; // 화면에 표시되는 최저가

    @Column(nullable = false)
    private int myprice; // 내가 설정한 관심 가격
}