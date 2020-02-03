package com.enbo.test;

import com.enbo.mapper.UsersMapper;
import com.enbo.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author enbo.xie
 * @date 2020-01-28 00:12:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void inserUserTest(){
        Users users = new Users();
        users.setUsername("lucy");
        users.setUserage(22);
        this.usersMapper.insertUser(users);
    }
}
