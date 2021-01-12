package com.etc.dao;

import com.etc.entity.Member;
import com.etc.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface TypeDao extends JpaRepository<Type,Integer>, JpaSpecificationExecutor<Type>, Serializable {
    public Type findByTid(int id);
}
