package com.wenhe.demomybatis.Mapper;

import com.wenhe.demomybatis.domain.User;

import java.util.List;

/**
 * @Author : XingLZ
 * @Description :
 * @Data : Create at 9:20 2018-10-18
 * @Modify By :
 */
public interface UserMapper {

    /**
     * 获取所有数据
     * @return
     */
    List<User> getAll();

}
