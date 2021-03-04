package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.pojo.Member;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
public interface IMemberService extends IService<Member> {

    List<User> getMembers(Integer id);

    RespBean deleteMember(Integer id, int number);

    RespBean deleteTeam(Integer id);

    RespBean addTeam(Member member);

    RespBean updateTeam(Integer id);
}
