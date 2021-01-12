package com.etc.entity;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid; //地址id
    private String useraddress; //用户地址
    private Integer isdefault; //是否为默认地址 0为默认,1为不是;
    private String useraccount; //地址姓名;
    private String username; //收件人
    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public Address() {
    }

    public Address(Integer aid, String useraddress, Integer isdefault, String useraccount, String username, User user) {
        this.aid = aid;
        this.useraddress = useraddress;
        this.isdefault = isdefault;
        this.useraccount = useraccount;
        this.username = username;
        this.user = user;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }


    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", useraddress='" + useraddress + '\'' +
                ", isdefault=" + isdefault +
                ", useraccount='" + useraccount + '\'' +
                ", username='" + username + '\'' +
                ", user=" + user +
                '}';
    }
}
