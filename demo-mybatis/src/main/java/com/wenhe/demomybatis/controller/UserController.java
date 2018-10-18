package com.wenhe.demomybatis.controller;

import com.wenhe.demomybatis.Service.IUserService;
import com.wenhe.demomybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : XingLZ
 * @Description :
 * @Data : Create at 9:55 2018-10-18
 * @Modify By :
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/getUsers")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(value="/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value="/index")
    public String index(ModelMap map) {
        map.put("name","wenhe");
        return "index";
    }
}
