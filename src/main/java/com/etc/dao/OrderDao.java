package com.etc.dao;

import com.etc.entity.Member;
import com.etc.entity.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface OrderDao extends JpaRepository<order,Integer>, JpaSpecificationExecutor<order>, Serializable {
    public order findByOid(int id);
}
