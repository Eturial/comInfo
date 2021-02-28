package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.RoleMapper;
import com.effort.server.pojo.Role;
import com.effort.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
