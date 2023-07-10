package com.persistent.jobportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="users")
//user info class
public class Users {

    //id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long userId;
    //name
    private String userName;
    //email
    @Email
    private String email;
    //password
    private String password;
    //highestQualification
    private String qualification;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Users))
            return false;

        Users user = (Users) obj;
        boolean isEquals = true;
        isEquals = user.getEmail().equals(this.email)
                && user.getPassword().equals(this.password)
                && user.getQualification().equals(this.qualification)
                && user.getUserName().equals(this.userName)
                && user.getUserId() == this.userId;

        return isEquals;
    }

    @Override
    public String toString() {
        return "Email: "+email+", Password: "+password;
    }
}
