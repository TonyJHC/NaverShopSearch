package com.sparta.myselectshop.service.Product;

import com.sparta.myselectshop.models.Entity.Product;
import com.sparta.myselectshop.models.Dto.ProductMyPriceRequestDto;
import com.sparta.myselectshop.models.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다. (Spring에게 final 선언된 멤버 변수 자동으로 생성해달라고 함)
@Service // 서비스임을 선언합니다.
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언합니다. ( DB 정보를 바꾼는 메소드라고 알려줌 )
    public Long update(Long id, ProductMyPriceRequestDto requestDto) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        product.update(requestDto);
        return id;
    }
}