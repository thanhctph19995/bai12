package com.example.appchat;

public class Message {
    private String userId, userName;
    private String messageText;

    public Message() {

    }

    public Message(String userId, String userName, String messageText) {
        this.userId = userId;
        this.userName = userName;
        this.messageText = messageText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}