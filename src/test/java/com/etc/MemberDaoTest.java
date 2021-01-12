package com.etc;

import com.etc.dao.MemberDao;
import com.etc.entity.Member;
import com.etc.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberDaoTest {
    @Autowired
    MemberDao memberDao;
    @Autowired
    MemberService memberService;
    @Test
    public void findMemberByage(){
        int age=18;
        Member member=memberDao.findByMemberAge(age);
        System.out.println(member.getMemberSex()+"   "+member.getMemberAddress());
    }
    @Test
    public void findMemberServiceByage(){
        int age=18;
        Member member=memberService.queryByAge(age);
        System.out.println(member.getMemberSex()+"   "+member.getMemberAddress());
    }
}
