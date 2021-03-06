package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.RaceMapper;
import com.effort.server.mapper.SchoolMapper;
import com.effort.server.pojo.Race;
import com.effort.server.pojo.RespBean;
import com.effort.server.service.IRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Service
public class RaceServiceImpl extends ServiceImpl<RaceMapper, Race> implements IRaceService {
    @Autowired
    private RaceMapper raceMapper;

    @Override
    public RespBean setRace(Integer id, String name, String status, LocalDateTime start_time, LocalDateTime end_time) {
        Race race = raceMapper.selectById(id);
        race.setName(name);
        race.setStatus(status);
        race.setStartTime(start_time);
        race.setEndTime(end_time);

        return RespBean.success("修改成功");
    }

    @Override
    public RespBean addRace(String name, String status, LocalDateTime start_time, LocalDateTime end_time) {
        Race race = new Race();
        raceMapper.addRace(name, status, start_time, end_time);
        return RespBean.success("添加成功", race);
    }

//    @Override
//    public RespBean deleteRace(Integer id) {
//        raceMapper.deleteById(id);
//        return RespBean.success("删除成功");
//    }
}
