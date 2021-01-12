package com.etc.dao;

import com.etc.entity.Member;
import com.etc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface ProductDao extends JpaRepository<Product,Integer>, JpaSpecificationExecutor<Product>, Serializable {
    public Product findByPid(int id);
}
