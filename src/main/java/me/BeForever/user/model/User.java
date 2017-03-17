package me.BeForever.user.model;


import java.util.Date;

public class User {

    private String id;
    private String password;
    private String username;
    private String realName;
    private String nickName;
    private int sex;
    private String email;
    private String phone;
    private Date birthDate;
    private String photo;
    private int role;

    public User() {

    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String password, String username, String realName, String nickName, int sex, String phone, String email, Date birthDate, String photo, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.nickName = nickName;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
