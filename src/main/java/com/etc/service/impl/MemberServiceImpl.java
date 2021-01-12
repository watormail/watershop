package com.etc.service.impl;

import com.etc.dao.MemberDao;
import com.etc.entity.Member;
import com.etc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
   private MemberDao memberDao;

    @Override
    public Member queryByAge(int age) {
        return memberDao.findByMemberAge(age);
    }
}
