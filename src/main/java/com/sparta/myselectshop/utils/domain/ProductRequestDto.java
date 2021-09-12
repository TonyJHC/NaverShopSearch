package com.sparta.myselectshop.utils.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// PrductRequestDto : 관심 상품 등록하기
@Getter
@RequiredArgsConstructor // final선언한 멤버변수에대한 생성자를 만들어줌
public class ProductRequestDto {
    private final String query;
    private final String display;
    private final int start;
    private final String sim;
}
