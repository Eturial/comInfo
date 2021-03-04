package com.effort.server.controller;


import com.effort.server.mapper.PrizeMapper;
import com.effort.server.pojo.Prize;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.Task;
import com.effort.server.service.IPrizeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
@RestController
@RequestMapping("/prize")
public class PrizeController {

    @Autowired
    private IPrizeService prizeService;

    @ApiOperation(value = "获取获奖情况")
    @GetMapping("/task/{user_id}")
    public Prize getPrize(@PathVariable("user_id") Integer userId) {
        return getPrize(userId);
    }

    @ApiOperation(value = "添加获奖情况")
    @PutMapping("/prize")
    public RespBean addPrize(@RequestBody Prize prize) {
        prizeService.addPrize(prize);
        return RespBean.success("添加成功");
    }
}
