package com.effort.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.UserMapper;
import com.effort.server.pojo.User;
import com.effort.server.pojo.RespBean;
import com.effort.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
//    @Autowired
//    private UserDetailsService userDetailsService;

//    @Value("${jwt.tokenHead}")
//    private String tokenHead;

//    /**
//     * 登录之后返回token
//     * @param username
//     * @param password
//     * @param request
//     * @return
//     */
//    @Override
//    public RespBean login(String username, String password, HttpServletRequest request) {
//        // 登录
//        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//        if(null == userDetails || passwordEncoder.matches(password, userDetails.getPassword())) {
//            return RespBean.error("用户名或密码不正确");
//        }
//        if(!userDetails.isEnabled()) {
//            return RespBean.error("账号被禁用，请联系管理员!");
//        }
//
//        // 更新security 登录用户对象
//        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//
//        // 生成token
//        String token = jwtTokenUtil.generateToken(userDetails);
//        Map<String, String> tokenMap = new HashMap<>();
//        tokenMap.put("token", token);
//        tokenMap.put("tokenHead", tokenHead);
//
//        return RespBean.success("登陆成功", tokenMap);
//    }

    @Override
    public RespBean login(String username, String password, HttpServletRequest request) {
        return RespBean.success("登录成功");
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("account", username));
    }

    @Override
    public RespBean register(User user, HttpServletRequest request) {
        userMapper.insert(user);
        return null;
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }


}