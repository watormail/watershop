package com.etc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Seller implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer sellerId;  //卖家ID

    private String sellerName;  //卖家名称

    private String storeName;  //店铺名称

    private  String sellerPhone;  //卖家电话

    private String sellerIdentity;  //卖家身份证

    private String sellerAddress; //卖家地址

    private Integer sellerMark; //是否通过验证

    public Seller() {
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerIdentity() {
        return sellerIdentity;
    }

    public void setSellerIdentity(String sellerIdentity) {
        this.sellerIdentity = sellerIdentity;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public Integer getSellerMark() {
        return sellerMark;
    }

    public void setSellerMark(Integer sellerMark) {
        this.sellerMark = sellerMark;
    }
}
