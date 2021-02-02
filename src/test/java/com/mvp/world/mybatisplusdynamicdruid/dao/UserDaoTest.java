package com.mvp.world.mybatisplusdynamicdruid.dao;

import com.mvp.world.mybatisplusdynamicdruid.model.po.UserPo;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    UserDao userDao;

    @Test
    public void getByTypeTest() {
        int type = 1;
        List<UserPo> userPos = userDao.getByTypeDefaultDB(type);
        System.out.println("From master DB:");
        if (CollectionUtils.isNotEmpty(userPos)) {
            userPos.forEach(user -> System.out.println("user: " + user));
        } else  {
            System.out.println("userPos is empty");
        }

        System.out.println("From slave DB:");
        userPos = userDao.getByType(type);
        if (CollectionUtils.isNotEmpty(userPos)) {
            userPos.forEach(user -> System.out.println("user: " + user));
        } else  {
            System.out.println("userPos is empty");
        }
    }

    @Test
    public void selectUserByIdTest() {
        Long id = 1L;
        UserPo userPo = userDao.selectUserById(id);
        System.out.println(userPo);
    }
}
