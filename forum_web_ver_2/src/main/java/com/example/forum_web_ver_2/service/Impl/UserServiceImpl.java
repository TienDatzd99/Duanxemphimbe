package com.example.forum_web_ver_2.service.Impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forum_web_ver_2.dto.UserDto;
import com.example.forum_web_ver_2.entity.User;
import com.example.forum_web_ver_2.reponsitory.UserReponsitory;
import com.example.forum_web_ver_2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReponsitory userReponsitory;

    @Override
    public void save(UserDto userDto) {
        LocalDateTime Date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String creationDate = Date.format(formatter);
        User user = new User(
            userDto.getEmail(),             // Email từ UserDto
            userDto.getTaiKhoan(),          // Tài khoản từ UserDto
            userDto.getSoDt(),              // Số điện thoại từ UserDto
            userDto.getPassword(),          // Mật khẩu từ UserDto
            "ROLE_USER"  
        );
    
        userReponsitory.save(user);
        
    }

    @Override
    public Boolean checkPasswordUser(String email, String password) {
        User user = userReponsitory.findUserByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public Boolean checkUserbyEmail(String email) {
        return userReponsitory.findUserByEmail(email) != null;
    }

    @Override
    public User getUserbyEmail(String email) {
        return userReponsitory.getUserByEmail(email);
    }
}
