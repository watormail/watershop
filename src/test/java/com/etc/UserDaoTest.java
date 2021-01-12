package com.etc;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;
    @Test
    public void findBynameAndPassword(){
        String name="xiaohong";
        String password="123456";
        User user=userDao.findByUserNameAndUserPassword(name,password);
        System.out.println("用户id为："+user.getUserId()+"用户名为："+user.getUserName()+"用户密码为："+user.getUserPassword()
        +"用户对应的会员编号为："+user.getM().getMemberId()+"会员性别为："+user.getM().getMemberSex());
    }
    @Test
    public void findByServiceNameAndPassword(){
        String name="xiaohong";
        String password="123456";
        User user=userService.findByNameAndPassword(name,password);
        System.out.println("用户id为："+user.getUserId()+"用户名为："+user.getUserName()+"用户密码为："+user.getUserPassword()
                +"用户对应的会员编号为："+user.getM().getMemberId()+"会员性别为："+user.getM().getMemberSex());
    }
}
