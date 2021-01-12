package com.etc;

import com.etc.dao.OrderDao;
import com.etc.entity.order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderDaoTest {
    @Autowired
    OrderDao orderDao;
    @Test
    public void findorderbyid(){
        int id=1;
        order order=orderDao.findByOid(id);
        System.out.println("当前订单编号为："+order.getOid());
    }
}
