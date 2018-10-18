package com.wenhe.demomybatis.Service;

import com.wenhe.demomybatis.domain.User;

import java.util.List;

/**
 * @Author : XingLZ
 * @Description :
 * @Data : Create at 9:21 2018-10-18
 * @Modify By :
 */
public interface IUserService {

    /**
     * 获取所有数据
     * @return
     */
    List<User> getAll();

}
