package com.effort.server.controller;


import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import com.effort.server.pojo.User;
import com.effort.server.service.IUserService;
import com.effort.server.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "获取用户")
    @GetMapping("/user/{id}")
    public User getUsers(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @ApiOperation(value = "获取所有用户")
    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getUsers();
    }


}
