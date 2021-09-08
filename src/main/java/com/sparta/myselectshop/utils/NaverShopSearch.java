package com.sparta.myselectshop.utils;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class NaverShopSearch {
    public String search() {
        // ARC에서 복사해온 코드를 넣음
        // GET방식 : https://openapi.naver.com/v1/search/shop.json?query=iphone
        // Heather
        // X-Naver-Client-Id : NrnFwFioK7TroNw74LfL
        // X-Naver-Client-Secret : 6YDwwxdtbD
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Naver-Client-Id", "NrnFwFioK7TroNw74LfL");
        headers.add("X-Naver-Client-Secret", "6YDwwxdtbD");
        String body = "";


        HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers); // body 안에 우리가 받은 결과물 넣음
        ResponseEntity<String> responseEntity = rest.exchange("https://openapi.naver.com/v1/search/shop.json?query=아디다스", HttpMethod.GET, requestEntity, String.class);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        int status = httpStatus.value(); // ex ) 200 -> 성공적으로 받아온 것
        String response = responseEntity.getBody(); // 결과화면이 String 한줄로 들어가 있음
        System.out.println("Response status: " + status);
        System.out.println(response);

        return response;
    }

    public static void main(String[] args) {
        NaverShopSearch naverShopSearch = new NaverShopSearch();
        naverShopSearch.search();
    }
}