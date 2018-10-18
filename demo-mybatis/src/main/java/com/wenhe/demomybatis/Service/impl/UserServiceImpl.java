package com.wenhe.demomybatis.Service.impl;

import com.wenhe.demomybatis.Mapper.UserMapper;
import com.wenhe.demomybatis.Service.IUserService;
import com.wenhe.demomybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : XingLZ
 * @Description :
 * @Data : Create at 9:21 2018-10-18
 * @Modify By :
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
