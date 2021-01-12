package com.etc.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;//用户编号id
    private String userAccount;//注册使用的邮箱或手机
    private String userName;//用户昵称
    private String userPassword;//用户密码
    //外键所对应的主键表的实体类的类型
    @OneToOne(fetch = FetchType.EAGER)//查询文章时，把文章的作者也查询出来
    @JoinColumn(name = "user_member_id")//连接的外键
    private Member m;
    public User() {
    }
    public User(Integer userId,String userAccount,String userName,String userPassword){
        this.userId=userId;
        this.userAccount=userAccount;
        this.userName=userName;
        this.userPassword=userPassword;
    }
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Member getM() {
        return m;
    }

    public void setM(Member m) {
        this.m = m;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
