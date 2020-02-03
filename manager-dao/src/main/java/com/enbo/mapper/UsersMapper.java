package com.enbo.mapper;

import com.enbo.pojo.Users;

import java.util.List;

/**
 * @author enbo.xie
 * @date 2020-01-27 23:25:32
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
