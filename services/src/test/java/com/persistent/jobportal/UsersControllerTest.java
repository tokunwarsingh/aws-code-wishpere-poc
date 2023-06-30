package com.persistent.jobportal;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import com.persistent.jobportal.entity.Users;
import com.persistent.jobportal.service.impl.UsersServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsersControllerTest {

    @InjectMocks
    UsersServiceImpl usersServiceImpl;

    @Mock
    Users dao;

//    @Before
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    public void getEmployeeByIdTest()
    {
        Users users =new Users();
        users.setUserId(1);
        users.setUserName("test");
        users.setEmail("test@gmail.com");
        users.setQualification("BE");
        users.setPassword("test123");
       // users.setSkills("java");
        when(dao.getEmail()).thenReturn(users.getEmail());

        //EmployeeVO emp = manager.getEmployeeById(1);

        assertEquals("test", users.getUserName());
        assertEquals("BE", users.getQualification());
        assertEquals("test123", users.getPassword());
        //assertEquals("java", emp.getSkills());
        //assertEquals("user@email.com", emp.getEmail());
    }

}
