package com.effort.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.effort.server.pojo.Race;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Mapper
public interface RaceMapper extends BaseMapper<Race> {

    void addRace(String name, String status, LocalDateTime start_time, LocalDateTime end_time);
}
