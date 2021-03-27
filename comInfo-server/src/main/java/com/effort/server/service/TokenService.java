package com.effort.server.service;

import com.effort.server.pojo.User;

public interface TokenService {
    String getToken(User user);
}
