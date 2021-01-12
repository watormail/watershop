package com.etc.dao;

import com.etc.entity.Member;
import com.etc.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface SellerDao extends JpaRepository<Seller,Integer>, JpaSpecificationExecutor<Seller>, Serializable {
    public Seller findBySellerId(int id);
}
