package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.pojo.Race;
import com.effort.server.pojo.RespBean;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
public interface IRaceService extends IService<Race> {
    /**
     * 修改比赛
     * @param id
     * @param name
     * @param status
     * @param start_time
     * @param end_time
     * @return
     */
    RespBean setRace(Integer id, String name, String status, LocalDateTime start_time, LocalDateTime end_time);

    /**
     * 新增比赛
     * @param name
     * @param status
     * @param start_time
     * @param end_time
     * @return
     */
    RespBean addRace(String name, String status, LocalDateTime start_time, LocalDateTime end_time);

    /**
     * 删除比赛
     * @param id
     * @return
     */
    RespBean deleteRace(Integer id);
}
