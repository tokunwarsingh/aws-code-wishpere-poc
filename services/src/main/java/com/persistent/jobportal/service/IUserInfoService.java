package com.persistent.jobportal.service;

import com.persistent.jobportal.entity.UserInfo;

import java.util.List;

public interface IUserInfoService {
    //verify user based on email and password
    public UserInfo verifyUser(String email, String password);

    //fetch user based on email
    public UserInfo fetchUser(String email);

    //register user
    public UserInfo registerUser(UserInfo userInfo);

    //modify user based on email
    public UserInfo modifyUser(String email, UserInfo userInfo);

    //delete user based on id
    public void deleteUser(Long id);

    //get all users
    public List<UserInfo> getAllUsers();





}
