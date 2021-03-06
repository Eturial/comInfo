package com.effort.server.controller;


import com.effort.server.pojo.Member;
import com.effort.server.pojo.Race;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.User;
import com.effort.server.service.IMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @ApiOperation(value = "获取成员")
    @GetMapping("/member/{id}")
    public List<User> getMembers(@PathVariable("id") Integer id) {
        return memberService.getMembers(id);
    }

    @ApiOperation(value = "新增组")
    @PutMapping("/member")
    public RespBean addTeam(Member member) {
        return memberService.addTeam(member);
    }

    @ApiOperation(value = "删除组内成员")
    @PostMapping("/member/{id}")
    public RespBean deleteMember(@PathVariable("id") Integer id, int number) {
        return memberService.deleteMember(id, number);
    }

//    @ApiOperation(value = "删除组")
//    @PostMapping("/member/{id}")
//    public RespBean deleteTeam(@PathVariable("id") Integer id) {
//        return memberService.deleteTeam(id);
//    }

//    @ApiOperation(value = "修改组")
//    @PostMapping("/member/{id}")
//    public RespBean updateTeam(@PathVariable("id") Integer id) {
//        return memberService.updateTeam(id);
//    }

}
