package com.persistent.jobportal.controller;
import com.persistent.jobportal.entity.UserInfo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    // define a login controller method
    @PostMapping("/login")
    public boolean login(@RequestBody UserInfo user) {
        try {
            Connection conn =MySqlConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT Count(*) AS recordCount FROM users WHERE email = '" + user.getEmail() + "' AND password = '" + user.getPassword() + "'";
            ResultSet resultSet= stmt.executeQuery(sql);
            resultSet.next();
            int count = resultSet.getInt("recordCount");
            conn.close();
            if(count==1)
                return true;
            else
                return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

   @GetMapping("/getUserInfo")
    public UserInfo getUserInfo() {
        MySqlConnection();
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("anyname");
        userInfo.setPassword("anypasword");
        return userInfo;
    }

    public Connection MySqlConnection() {
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://awspoc.mysql.database.azure.com:3306/aws-poc", "pocadmin", "Test@1234");
            System.out.println("Connection Established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}