package com.etc.dao;

import com.etc.entity.Member;
import com.etc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface MemberDao extends JpaRepository<Member,Integer>, JpaSpecificationExecutor<Member>, Serializable {
    public Member findByMemberAge(int age);
}
