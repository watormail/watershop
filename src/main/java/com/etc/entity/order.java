package com.etc.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "myorder")
public class order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid;//订单编号

    private Integer opcount;//购买数量
    private double ototal;//最终交易总金额

    @ManyToOne
    @JoinColumn(name="product_pid")
    private Product pro;//商品id

    @ManyToOne
    @JoinColumn(name="myorder_user_id")
    private User u;

    private double oprice;//商品交易时的单价
    @Column(name="o_address")
    private String oaddress;//交易时的地址
    @Column(name = "o_state")
    private Integer ostate;//订单状态

    public order() {
    }

    public order(Integer oid, Integer opcount, double ototal, Product pro, User u, double oprice, String oaddress, Integer ostate) {
        this.oid = oid;
        this.opcount = opcount;
        this.ototal = ototal;
        this.pro = pro;
        this.u = u;
        this.oprice = oprice;
        this.oaddress = oaddress;
        this.ostate = ostate;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOpcount() {
        return opcount;
    }

    public void setOpcount(Integer opcount) {
        this.opcount = opcount;
    }

    public double getOtotal() {
        return ototal;
    }

    public void setOtotal(double ototal) {
        this.ototal = ototal;
    }

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    @Override
    public String toString() {
        return "order{" +
                "oid=" + oid +
                ", opcount=" + opcount +
                ", ototal=" + ototal +
                ", pro=" + pro +
                ", u=" + u +
                ", oprice=" + oprice +
                ", oaddress='" + oaddress + '\'' +
                ", ostate=" + ostate +
                '}';
    }
}
