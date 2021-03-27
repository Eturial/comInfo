package com.effort.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;
import com.effort.server.pojo.UserLoginParam;
import com.effort.server.service.IUserService;
import com.effort.server.service.LoginService;
import com.effort.server.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * 登录
 *
 * @author 86137
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/login")
@Api
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService service;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/check")
    @ApiResponse(code = 200, message = "登录确认")
    @ApiOperation(value = "获取用户登录信息", produces = "application/json", httpMethod = "POST")
    @ApiImplicitParam(paramType = "UserLoginParam", name = "user")
    public Object isLogin(@RequestBody UserLoginParam reqUserLogin) {
        JSONObject object = new JSONObject();
        User user = service.getUserById(reqUserLogin.getId());
        if (user == null) {
            object.put("message", false);
        } else {
            if (!user.getPassword().equals(reqUserLogin.getPassword())) {
                object.put("message", false);
            } else {
                String token = tokenService.getToken(user);
                object.put("token", token);
                object.put("message", true);
            }
        }
        return object;
    }
}
