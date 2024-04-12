package com.cos.springoauth2.dto;

public interface OAuth2Response {

    //네이버,구글
    String getProvider();
    //제공자에서 발급해주는 아이디
    String getProviderId();
    //이메일
    String getEmail();
    //사용자 실명
    String getName();
}
