package com.etc;

import com.etc.dao.TypeDao;
import com.etc.entity.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TypeDaoTest {
@Autowired
    TypeDao typeDao;
@Test
    public void findTypebyid(){
    int id=1;
    Type type=typeDao.findByTid(id);
    System.out.println("类型编号为："+type.getTid());
}
}
