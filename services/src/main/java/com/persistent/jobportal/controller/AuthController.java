package com.persistent.jobportal.controller;
import com.persistent.jobportal.entity.Users;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {
    // define a login controller method
    @PostMapping("/signin")
    public boolean login(@RequestBody Users user) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = MySqlConnection();
            pstmt = conn.prepareStatement("SELECT count(*) AS recordCount FROM users WHERE email = ? AND password = ? ");
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            rs = pstmt.executeQuery();
            rs.next();
            int count = rs.getInt("recordCount");
            //conn.close();
            if(count==1)
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NullPointerException e){
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

   @GetMapping("/getUserInfo")
    public Users getUserInfo() {
        MySqlConnection();
        Users userInfo = new Users();
        userInfo.setEmail("anyname");
        userInfo.setPassword("anypasword");
        return userInfo;
    }

    public Connection MySqlConnection() {
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://awspoc.mysql.database.azure.com:3306/aws-poc", "pocadmin", "Test@1234");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal2", "root", "root");
            System.out.println("Connection established successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}