package com.effort.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.effort.server.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUsers();
}
