package com.sparta.myselectshop.utils.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductRestController {

    //    final 레파지토리
    //    final 서비스

    @PostMapping("/api/products")
    public Long postProduct(@RequestBody ProductReqDto, Long id) {

    }


    @GetMapping("/api/products")

    @PutMapping("/api/products/{id}")

    @DeleteMapping("/api/products/{id}")
}
