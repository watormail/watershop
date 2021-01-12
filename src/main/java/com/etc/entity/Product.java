package com.etc.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid; //商品ID
    private String pname; //商品名称
    private double price; //商品价格
    private int psize; //商品库存
    @ManyToOne
    @JoinColumn(name = "p_tid")
    private Type type;//商品类别
    private  String pImg; //商品图片
    private int pMark; //是否下架
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller; //卖家

    public Product() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPsize() {
        return psize;
    }

    public void setPsize(int psize) {
        this.psize = psize;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getpImg() {
        return pImg;
    }

    public void setpImg(String pImg) {
        this.pImg = pImg;
    }

    public int getpMark() {
        return pMark;
    }

    public void setpMark(int pMark) {
        this.pMark = pMark;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
