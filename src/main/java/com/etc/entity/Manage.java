package com.etc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manageId;   //管理员id
    private String manageName;  //管理员用户名
    private String managePwd;  //管理员密码
    private String manageLevel; //管理员权限 0普通管理员,1超级管理员

    public Manage(int manageId, String manageName, String managePwd, String manageLevel) {
        this.manageId = manageId;
        this.manageName = manageName;
        this.managePwd = managePwd;
        this.manageLevel = manageLevel;
    }

    public Manage() {
    }

    public int getManageId() {
        return manageId;
    }

    public void setManageId(int manageId) {
        this.manageId = manageId;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    public String getManagePwd() {
        return managePwd;
    }

    public void setManagePwd(String managePwd) {
        this.managePwd = managePwd;
    }

    public String getManageLevel() {
        return manageLevel;
    }

    public void setManageLevel(String manageLevel) {
        this.manageLevel = manageLevel;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "manageId=" + manageId +
                ", manageName='" + manageName + '\'' +
                ", managePwd='" + managePwd + '\'' +
                ", manageLevel='" + manageLevel + '\'' +
                '}';
    }
}
