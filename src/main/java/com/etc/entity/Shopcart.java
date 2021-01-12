package com.etc.entity;

import javax.persistence.*;

@Entity
public class Shopcart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid; //购物车编号
    private Integer scount;//数量
    private double stotal;//总价
    private Integer status;//购物车状态

    @ManyToOne
    @JoinColumn(name = "pid")
    private Product product; //外键，购物车对应商品

    @ManyToOne
    @JoinColumn(name = "shopcart_userid")
    private User user;//外键，用户对应的购物车

    public Shopcart() {
    }

    public Shopcart(Integer sid, Integer scount, double stotal, Integer status, Product product, User user) {
        this.sid = sid;
        this.scount = scount;
        this.stotal = stotal;
        this.status = status;
        this.product = product;
        this.user = user;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }

    public double getStotal() {
        return stotal;
    }

    public void setStotal(double stotal) {
        this.stotal = stotal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Shopcart{" +
                "sid=" + sid +
                ", scount=" + scount +
                ", stotal=" + stotal +
                ", status=" + status +
                ", product=" + product +
                ", user=" + user +
                '}';
    }
}
