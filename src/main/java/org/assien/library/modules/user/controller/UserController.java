package org.assien.library.modules.user.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.assien.library.modules.user.entity.User;
import org.assien.library.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：WUJILIANG
 * @date ：2021/7/29 15:24
 * @description：用户
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        String str = "Hello，SpringBoot!";
        return str;
    }

    /**
     * @param
     * @description: 根据id获取用户
     * @return: java.util.List<org.assien.library.modules.user.entity.User>
     * @author: WuJiLiang
     * @time: 2021/7/29 17:18
     */
    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    public List<User> getAll() {
        return userService.list();
    }

    /**
     * @param
     * @description: 根据用户名获取用户
     * @return: java.util.List<org.assien.library.modules.user.entity.User>
     * @author: WuJiLiang
     * @time: 2021/7/29 17:18
     */
    @RequestMapping(value = "/getUserByName")
    @ResponseBody
    public User getUserByName() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        userWrapper.eq("name", "Tom");
        return userService.getOne(userWrapper);
    }

}
