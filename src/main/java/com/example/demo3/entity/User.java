package com.example.demo3.entity;

import java.util.Date;

public class User {
    private String id;
    private String username;
    private String password;
    private Date createTime;

    public User(String s, String socks, String s1, Date date) {
        this.id = s;
        this.username = socks;
        this.password = s1;
        this.createTime = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
