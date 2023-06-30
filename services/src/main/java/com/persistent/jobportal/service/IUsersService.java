package com.persistent.jobportal.service;

import com.persistent.jobportal.entity.Users;

import java.util.List;

public interface IUsersService {
    //verify user based on email and password
    public Users verifyUser(String email, String password);

    //fetch user based on email
    public Users fetchUser(String email);

    //register user
    public Users registerUser(Users users);

    //modify user based on email
    public Users modifyUser(String email, Users users);

    //delete user based on id
    public void deleteUser(Long id);

    //get all users
    public List<Users> getAllUsers();





}
