package com.hxd.aoptest.entity;

public class User {
    private int id;
    private String number="";
    private String password="";


    public User() {
    }

    public User(int id, String number, String password) {
        this.id = id;
        this.number = number;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
