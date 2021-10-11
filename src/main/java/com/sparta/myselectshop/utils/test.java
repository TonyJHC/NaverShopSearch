package com.sparta.myselectshop.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class test {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("이름","덩치");

        obj.put("거주지","서울");
        JSONArray items = obj.getJSONArray("이름");

        String data = obj.toString();

        System.out.println(data);
        System.out.println(data.substring(0,1));

        System.out.println(data.substring(1,2));


    }
}
