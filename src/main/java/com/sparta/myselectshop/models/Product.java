package com.sparta.myselectshop.models;


import com.sparta.myselectshop.models.Dto.ProductMyPriceRequestDto;
import com.sparta.myselectshop.models.Dto.ProductRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Product : 관심 상품 테이블
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다. ( 테이블이 자동으로 생성되도록 )
public class Product extends Timestamped {

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

    // 관심 상품 등록하는 버튼을 눌렸을 때 productRequestDto 를 받아서 테이블로 만들어 줘야하니까 새로운 생성자가 필요함
    public Product(ProductRequestDto productRequestDto) {
        this.title = productRequestDto.getTitle();
        this.link = productRequestDto.getLink();
        this.lprice = productRequestDto.getLprice();
        this.image = productRequestDto.getImage();
        this.myprice = 0; // 최저가 설정을 처음에 0으로 해놓으면 최저가가 아닌 상품에 무분별하게 최저가 딱지가 붙는 것을 방지할 수 있다.
    }

    public void update(ProductMyPriceRequestDto productMyPriceRequestDto) {
        this.myprice = productMyPriceRequestDto.getMyprice();
    }
}