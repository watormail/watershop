package com.etc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;//会员编号id
    private double memberScore;//用户会员当前积分
    private String memberLevel;//用户会员等级
    private String memberSex;//会员性别
    private Integer memberAge;//会员年龄
    private String memberAddress;//会员详细地址
    public Member() {
    }
    public Member(Integer memberId,double memberScore,String memberLevel,
                  String memberSex,Integer memberAge,String memberAddress){
        this.memberId=memberId;
        this.memberScore=memberScore;
        this.memberLevel=memberLevel;
        this.memberSex=memberSex;
        this.memberAge=memberAge;
        this.memberAddress=memberAddress;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public double getMemberScore() {
        return memberScore;
    }

    public void setMemberScore(double memberScore) {
        this.memberScore = memberScore;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }
}
