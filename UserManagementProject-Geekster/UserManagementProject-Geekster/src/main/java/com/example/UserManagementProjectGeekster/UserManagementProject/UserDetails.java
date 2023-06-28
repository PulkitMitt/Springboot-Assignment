package com.example.UserManagementProjectGeekster.UserManagementProject;


public class UserDetails {
    Integer userId;
    String username;
    String dob;
    String email;
    Integer phoneNo;
    String date;
    String time;

    public UserDetails(Integer userId, String username, String dob, String email, Integer phoneNo, String date, String time) {
        this.userId = userId;
        this.username = username;
        this.dob = dob;
        this.email = email;
        this.phoneNo = phoneNo;
        this.date = date;
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
