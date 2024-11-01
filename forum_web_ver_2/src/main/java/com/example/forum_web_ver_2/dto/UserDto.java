package com.example.forum_web_ver_2.dto;

public class UserDto {
    private String email;
    private String taiKhoan;
    private String soDt;
    private String password;
    private String maLoaiNguoiDung;
    // No-argument constructor
    public UserDto() {
    }

    // Constructor with arguments
    public UserDto(String email, String taiKhoan, String soDt) {
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.soDt = soDt;
        this.password = password;
        this.maLoaiNguoiDung = maLoaiNguoiDung;
    }

    // Getters and setters (if needed)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRole() {
        return maLoaiNguoiDung;
    }
    
    public void setRole(String maLoaiNguoiDung) {
        this.maLoaiNguoiDung = maLoaiNguoiDung;
    }

    public Object getCheckPass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCheckPass'");
    }

    public String getUserDisplayName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserDisplayName'");
    }

    public String getTaiKhoan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTaiKhoan'");
    }

    public String getSoDt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSoDt'");
    }

}
