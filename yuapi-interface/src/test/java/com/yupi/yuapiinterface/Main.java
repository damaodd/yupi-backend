package com.yupi.yuapiinterface;


import com.example.yuapiclientsdk.client.YuApiClient;
import com.example.yuapiclientsdk.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "yupi";
        String secretKey = "abcdef";
        YuApiClient yuApiClient = new YuApiClient(accessKey,secretKey);
        String result1 = yuApiClient.getNameByGet("鱼皮");
        String result2 = yuApiClient.getNameByPost("鱼皮");
        User user = new User();
        user.setUsername("liyupi");
        String result3 = yuApiClient.getUserNameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
