package com.effort.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import org.apache.ibatis.annotations.Mapper;

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
public interface SchoolMapper extends BaseMapper<School> {

    /**
     *
     * @return
     */
    List<School> getSchools();

    void addSchool(String school);
}
