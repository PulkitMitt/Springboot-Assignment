package com.example.UserMnagementSystem.UserDetails;

public class User {

    public Integer UserId;
    public String Name;
    public String UserName;
    public String Address;
    public Integer PhoneNumber;

    public User(Integer userId, String name, String userName, String address, Integer phoneNumber) {
        this.UserId = userId;
        this.Name = name;
        this.UserName = userName;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        this.UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
