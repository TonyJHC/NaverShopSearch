package com.sparta.myselectshop.controller.Product;

import com.sparta.myselectshop.models.Product;
import com.sparta.myselectshop.models.ProductRepository;
import com.sparta.myselectshop.models.Dto.ProductRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다.
@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class ProductRestController {

    private final ProductRepository productRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        System.out.println("GET----------");
        return productRepository.findAll();
    }



    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto productRequestDto){
        System.out.println("POST Product-------");
        Product product = new Product(productRequestDto);
        productRepository.save(product);
        return product;
    }
}