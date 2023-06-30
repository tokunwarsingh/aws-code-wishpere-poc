package com.persistent.jobportal.repository;

import com.persistent.jobportal.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserInfoRepository extends CrudRepository<UserInfo,Long> {

    //verify user based on email and password combination
    UserInfo findByEmailAndPassword(String email, String password);

    //fetch  user based on email
    UserInfo findByEmail(String email);

    //update user based on email
    //UserInfo updateByEmail(UserInfo userInfo);

    //save  user
    UserInfo save(UserInfo userInfo);

    //delete user based on id
    void deleteById(long id);

    //fetch all user
    List<UserInfo> findAll();





}
