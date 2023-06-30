package com.persistent.jobportal.service.impl;

import com.persistent.jobportal.entity.Users;
import com.persistent.jobportal.repository.IUsersRepository;
import com.persistent.jobportal.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private IUsersRepository iUserInfoRepository;

    // verify user based on email and password
    @Override
    public Users verifyUser(String email, String password) {
        Users user = iUserInfoRepository.findByEmailAndPassword(email, password);
        return user;
    }

    //fetch user based on email
    @Override
    public Users fetchUser(String email) {
        return iUserInfoRepository.findByEmail(email);
    }


    // register user
    @Override
    public Users registerUser(Users users) {
        return iUserInfoRepository.save(users);
    }

    //modify user based on email
    @Override
    public Users modifyUser(String email, Users users) {
        //fetch user based on email
        Users users1 = iUserInfoRepository.findByEmail(email);
        if(users1!=null) {
            users1.setEmail(users.getEmail());
            users1.setPassword(users.getPassword());
            users1.setUserName(users.getUserName());
            users1.setQualification(users.getQualification());
        }
        return iUserInfoRepository.save(users);

    }

    //delete user based on id
    @Override
    public void deleteUser(Long id) {
        iUserInfoRepository.deleteById(id);
    }

    //get all users
    @Override
    public List<Users> getAllUsers() {
        return iUserInfoRepository.findAll();
    }

}
