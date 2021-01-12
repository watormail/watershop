package com.etc;

import com.etc.dao.SellerDao;
import com.etc.entity.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SellerDaoTest{
    @Autowired
    SellerDao sellerDao;
    @Test
    public void findSellerById(){
        int id=1;
        Seller seller=sellerDao.findBySellerId(id);
        System.out.println("销售人员的编号为："+seller.getSellerId());
    }
}
