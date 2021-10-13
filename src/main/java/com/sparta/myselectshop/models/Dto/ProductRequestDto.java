package com.sparta.myselectshop.models.Dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

// PrductRequestDto : 관심 상품 등록하기
@Getter // private 선언된 것 을 가져오기 위해
@RequiredArgsConstructor // final선언한 멤버변수에대한 생성자를 만들어줌
public class ProductRequestDto {
    private final String title;
    private final String link;
    private final String image;
    private final int lprice;


}
