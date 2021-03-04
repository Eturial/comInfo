package com.effort.server.controller;


import com.effort.server.pojo.Race;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import com.effort.server.service.IRaceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@RestController
@RequestMapping("/race")
public class RaceController {

    @Autowired
    private IRaceService raceService;

    @ApiOperation(value = "获取比赛")
    @GetMapping("/race/{id}")
    public Race getRaces(@PathVariable("id") Integer id) {
        return raceService.getById(id);
    }

    @ApiOperation(value = "修改比赛")
    @PostMapping("/race/{id}")
    public RespBean updateRace(@PathVariable("id") Integer id, String name, String status, LocalDateTime start_time, LocalDateTime end_time) {
        return raceService.setRace(id, name, status, start_time, end_time);
    }

    @ApiOperation(value = "新增比赛")
    @PutMapping("/race")
    public RespBean addRace(String name, String status, LocalDateTime start_time, LocalDateTime end_time) {
        return raceService.addRace(name, status, start_time, end_time);
    }

    @ApiOperation(value = "删除比赛")
    @PostMapping("/race/{id}")
    public RespBean deleteRace(@PathVariable Integer id) {
        return raceService.deleteRace(id);
    }
}
