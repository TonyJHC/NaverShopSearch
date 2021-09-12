package com.sparta.myselectshop.utils.controller;

import com.sparta.myselectshop.utils.domain.ProductRepository;
import com.sparta.myselectshop.utils.domain.ProductRequestDto;
import com.sparta.myselectshop.utils.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductRestController {

    //    final 레파지토리
    private final ProductRepository productRepository;
    //    final 서비스
    private final ProductService productService;

    @PostMapping("/api/products")
    public Product postProduct(@RequestBody ProductRequestDto productRequestDto, Long id) {
        productRepository.save(productRequestDto);

    }


//    @GetMapping("/api/products")
//
//    @PutMapping("/api/products/{id}")
//
//    @DeleteMapping("/api/products/{id}")
}
