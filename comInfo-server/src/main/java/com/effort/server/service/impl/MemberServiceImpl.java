package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.MemberMapper;
import com.effort.server.mapper.UserMapper;
import com.effort.server.pojo.Member;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;
import com.effort.server.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<User> getMembers(Integer id) {
        List<User> userList = null;
        userList.add(memberMapper.selectById(id).getMember1());
        userList.add(memberMapper.selectById(id).getMember2());
        userList.add(memberMapper.selectById(id).getMember3());
        userList.add(memberMapper.selectById(id).getMember4());
        userList.add(memberMapper.selectById(id).getMember5());

        return userList;

    }

    @Override
    public RespBean deleteMember(Integer id, int number) {
        if(number <= 0 && number > 5)
            return RespBean.error("删除失败");

        getMembers(id).remove(number - 1);
        return RespBean.success("删除成功");

    }

//    @Override
//    public RespBean deleteTeam(Integer id) {
//        memberMapper.deleteById(id);
//        return RespBean.success("删除成功");
//    }

    @Override
    public RespBean addTeam(Member member) {
        memberMapper.insert(member);
        return RespBean.success("添加成功");
    }

//    @Override
//    public RespBean updateTeam(Integer id) {
//        memberMapper.updateById(memberMapper.selectById(id));
//        return RespBean.success("修改成功");
//    }
}
