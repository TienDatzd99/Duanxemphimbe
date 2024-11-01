package com.example.forum_web_ver_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dbo_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    //Tài khoản đăng nhập kết nối với database
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "taiKhoan",nullable = false)
    private String taiKhoan;

    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "soDt",nullable = false)
    private String soDt;

    @Column(name = "matKhau",nullable = false)
    private String matKhau;

    @Column(name = "maLoaiNguoiDung",nullable = false)
    private String maLoaiNguoiDung;


    public User(String email, String taiKhoan, String soDt, String matKhau, String maLoaiNguoiDung) {
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.soDt = soDt;
        this.matKhau = matKhau;
        this.maLoaiNguoiDung = maLoaiNguoiDung;
    }


    public Object getRole() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRole'");
    }


    public Object getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }
}
