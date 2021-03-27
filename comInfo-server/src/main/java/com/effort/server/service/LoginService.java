package com.effort.server.service;

import com.effort.server.pojo.User;
import com.effort.server.pojo.UserLoginParam;

public interface LoginService {
    boolean login(UserLoginParam user);
    User getUserById(long id);
}
