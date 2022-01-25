package com.aroundThirty.model;

public class PostDto {
    public String postDt = null; // 발견날짜 및 시간
    public String postPlace = null; // 발견장소
    public String kindPost = null; // 제보 동물에 대한 품종
    public String phoneNum = null; // 전화번호
    public String detail = null; // 게시글 본문
    public String postCreateDt = null; // 게시글 작성날짜 및 시간
    public String postModifyDt = null; // 게시글 수정날짜 및 시간
    public String userId = null; // 계정정보
    public int postNo = 2;

    public PostDto(String postDt, String postPlace, String kindPost, String phoneNum, String detail, String postCreateDt, String postModifyDt, String userId) {
        this.postDt = postDt;
        this.postPlace = postPlace;
        this.kindPost = kindPost;
        this.phoneNum = phoneNum;
        this.detail = detail;
        this.postCreateDt = postCreateDt;
        this.postModifyDt = postModifyDt;
        this.userId = userId;
    }

    public String getPostDt() {
        return postDt;
    }

    public void setPostDt(String postDt) {
        this.postDt = postDt;
    }

    public String getPostPlace() {
        return postPlace;
    }

    public void setPostPlace(String postPlace) {
        this.postPlace = postPlace;
    }

    public String getKindPost() {
        return kindPost;
    }

    public void setKindPost(String kindPost) {
        this.kindPost = kindPost;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPostCreateDt() {
        return postCreateDt;
    }

    public void setPostCreateDt(String postCreateDt) {
        this.postCreateDt = postCreateDt;
    }

    public String getPostModifyDt() {
        return postModifyDt;
    }

    public void setPostModifyDt(String postModifyDt) {
        this.postModifyDt = postModifyDt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "postDt='" + postDt + '\'' +
                ", postPlace='" + postPlace + '\'' +
                ", kindPost='" + kindPost + '\'' +
                ", phoneNum=" + phoneNum +
                ", detail='" + detail + '\'' +
                ", postCreateDt='" + postCreateDt + '\'' +
                ", postModifyDt='" + postModifyDt + '\'' +
                ", userId='" + userId + '\'' +
                ", postNo=" + postNo +
                '}';
    }
}
