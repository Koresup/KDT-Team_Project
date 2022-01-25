package com.aroundThirty.model;

public class UserDto {
    // User_Info
    private String userId = null; // 계정정보
    private String userPw = null; // 계정정보


    // 계정정보_Constructor
    public UserDto(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}
