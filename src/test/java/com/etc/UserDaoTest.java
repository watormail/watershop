package com.etc;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void findBynameAndPassword(){
        String name="xiaohong";
        String password="123456";
        User user=userDao.findByUserNameAndUserPassword(name,password);
        System.out.println(user.getUserId()+""+user.getUserName()+""+user.getUserPassword());
    }
}
