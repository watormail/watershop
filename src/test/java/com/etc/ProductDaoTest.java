package com.etc;

import com.etc.dao.ProductDao;
import com.etc.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDaoTest {
    @Autowired
    ProductDao productDao;
    @Test
    public void findProductByPid(){
        int id=5;
        Product product=productDao.findByPid(id);
        System.out.println("商品的编号为："+product.getPid()+"商品类别名称："+product.getType().getTname()+"销售员名称："
        +product.getSeller().getSellerName());
    }
}
