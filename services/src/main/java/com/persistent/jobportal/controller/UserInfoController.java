package com.persistent.jobportal.controller;

import com.persistent.jobportal.entity.UserInfo;
import com.persistent.jobportal.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserInfoController {
    @Autowired
    private UserInfoServiceImpl userInfoServiceImpl;

    // get user based on email and return user info
    @GetMapping("/{email}")
    public ResponseEntity<UserInfo> getUserInfo(@PathVariable("email") String email) {
        UserInfo userInfo = userInfoServiceImpl.fetchUser(email);
        return new ResponseEntity<UserInfo>(userInfo, HttpStatus.OK);
        // return "User Info";
    }

    //register user
    @PostMapping("/register")
    public ResponseEntity<UserInfo> registerUser(@RequestBody UserInfo userInfo) {
        UserInfo user = userInfoServiceImpl.registerUser(userInfo);
        return new ResponseEntity<UserInfo>(user, HttpStatus.CREATED);
    }

    //modify user
    @PutMapping("/modify/{email}")
    public ResponseEntity<UserInfo> modifyUser(@PathVariable("email") String email, @RequestBody UserInfo userInfo) {
        UserInfo user = userInfoServiceImpl.modifyUser(email, userInfo);
        return new ResponseEntity<UserInfo>(user, HttpStatus.OK);
    }

    //delete user
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userInfoServiceImpl.deleteUser(id);
        return new ResponseEntity<String>("User deleted successfully", HttpStatus.OK);
    }


    //get all users
    @GetMapping("/all")
    public ResponseEntity<List<UserInfo>> getAllUsers() {
        List<UserInfo> user = userInfoServiceImpl.getAllUsers();
        return new ResponseEntity<List<UserInfo>>(user, HttpStatus.OK);
    }

    //verify user
    @GetMapping("/verify/{email}/{password}")
    public ResponseEntity<UserInfo> verifyUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        UserInfo user = userInfoServiceImpl.verifyUser(email, password);
        return new ResponseEntity<UserInfo>(user, HttpStatus.OK);
    }

}
