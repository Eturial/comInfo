package com.effort.server.controller;

import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;
import com.effort.server.pojo.UserLoginParam;
import com.effort.server.pojo.UserRegisterParam;
import com.effort.server.service.IUserService;
import io.swagger.annotations.Api;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * 注册
 * @author 86137
 * @since 1.0.0
 */
@Api(tags = "RegisterController")
@RestController
public class RegisterController {
    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public RespBean register(@RequestBody UserRegisterParam userRegisterParam, HttpServletRequest request) {
        if(Objects.equals(userRegisterParam.getRePassword(), userRegisterParam.getRePassword())) {
            return userService.register(userRegisterParam, request);
        } else {
            return RespBean.error("两次输入密码不一致");
        }
    }

}
