package com.example.chattingapp.model;

import java.util.HashMap;
import java.util.Map;

public  class ChatModel {


    public Map<String,Boolean> Users = new HashMap<>(); // 채팅방의 유저들
    public Map<String,Comment> comments = new HashMap<>(); //채팅방의 내용

    public static class Comment {
       public String uid;
       public Object timestamp;
       public String message;
       public Map<String,Object> readUsers = new HashMap<>();
    }
}
