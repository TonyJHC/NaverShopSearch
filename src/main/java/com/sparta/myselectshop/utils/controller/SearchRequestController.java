package com.sparta.myselectshop.utils.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SearchRequestController {
    @GetMapping("/api/search?query={")
}
