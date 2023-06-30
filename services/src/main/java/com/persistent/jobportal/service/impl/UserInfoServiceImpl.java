package com.persistent.jobportal.service.impl;

import com.persistent.jobportal.entity.UserInfo;
import com.persistent.jobportal.repository.IUserInfoRepository;
import com.persistent.jobportal.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService{
    @Autowired
    private IUserInfoRepository iUserInfoRepository;

    // verify user based on email and password
    @Override
    public UserInfo verifyUser(String email, String password) {
        return iUserInfoRepository.findByEmailAndPassword(email, password);
    }

    //fetch user based on email
    @Override
    public UserInfo fetchUser(String email) {
        return iUserInfoRepository.findByEmail(email);
    }


    // register user
    @Override
    public UserInfo registerUser(UserInfo userInfo) {
        return iUserInfoRepository.save(userInfo);
    }

    //modify user based on email
    @Override
    public UserInfo modifyUser(String email, UserInfo userInfo) {
        //fetch user based on email
        UserInfo userInfo1 = iUserInfoRepository.findByEmail(email);
        if(userInfo1!=null) {
            userInfo1.setEmail(userInfo.getEmail());
            userInfo1.setExperience(userInfo.getExperience());
            userInfo1.setPassword(userInfo.getPassword());
            userInfo1.setName(userInfo.getName());
            userInfo1.setHighestQualification(userInfo.getHighestQualification());
        }
        return iUserInfoRepository.save(userInfo1);

    }

    //delete user based on id
    @Override
    public void deleteUser(Long id) {
        iUserInfoRepository.deleteById(id);
    }

    //get all users
    @Override
    public List<UserInfo> getAllUsers() {
        return iUserInfoRepository.findAll();
    }

}
