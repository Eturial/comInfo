package com.effort.server.service.impl;

import com.effort.server.mapper.UserMapper;
import com.effort.server.pojo.User;
import com.effort.server.pojo.UserLoginParam;
import com.effort.server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper loginDao;

    @Override
    public boolean login(UserLoginParam user) {
        User one = loginDao.getUserByPassword(user);
        return one != null;
    }


    @Override
    public User getUserById(long id) {
        return loginDao.getUserById(id);
    }
}
