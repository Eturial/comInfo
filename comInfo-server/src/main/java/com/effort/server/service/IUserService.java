package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;

import javax.servlet.http.HttpServletRequest;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
public interface IUserService extends IService<User> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 用户注册
     * @param user
     */
    RespBean register(User user, HttpServletRequest request);
}
