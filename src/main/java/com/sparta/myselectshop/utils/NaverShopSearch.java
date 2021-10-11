package com.sparta.myselectshop.utils;

import com.sparta.myselectshop.models.ItemDto;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

// 네이버 테스트
public class NaverShopSearch {
    public String search(String query) {
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
        ResponseEntity<String> responseEntity = rest.exchange("https://openapi.naver.com/v1/search/shop.json?query=" + query, HttpMethod.GET, requestEntity, String.class);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        int status = httpStatus.value(); // ex ) 200 -> 성공적으로 받아온 것
        String response = responseEntity.getBody(); // 결과화면이 String 한줄로 들어가 있음
        System.out.println("Response status: " + status);
        System.out.println(response);

        return response;
    }

    /*
     1. JsonObject
        : JsonObject는 객체(주로 String)을 Json객체로 바꿔주거나 Json객체를 새로 만드는 역할을 합니다.
     2. JsonArray
        : json들이 들어있는 Array(json 이외의 다른 데이터도 들어갈 수 있음)
    */
    public List<ItemDto> fromJSONtoItems(String result) { // Json을 items로 변경
        JSONObject rjson = new JSONObject(result); // String을 Json 객체로 변경
        JSONArray items = rjson.getJSONArray("items"); // JsonObjectdptj items 배열 꺼내기
        List<ItemDto> ret = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject itemJson = items.getJSONObject(i);
            System.out.println(itemJson);
            ItemDto itemDto = new ItemDto(itemJson);
            ret.add(itemDto);
        }
        return ret;
    }

    public static void main(String[] args) {
        NaverShopSearch naverShopSearch = new NaverShopSearch();
        String ret = naverShopSearch.search("아이맥");
        naverShopSearch.fromJSONtoItems(ret);
    }
}