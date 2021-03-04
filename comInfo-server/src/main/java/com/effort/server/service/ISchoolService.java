package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.mapper.SchoolMapper;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
public interface ISchoolService extends IService<School> {

    /**
     * 获取学校
     * @return
     */
    List<School> getSchools();

    /**
     * 添加学校
     * @param
     * @return
     */
    RespBean addSchool(String school);

    /**
     * 删除学校
     * @param id
     * @return
     */
    RespBean deleteSchool(Integer id);

    /**
     * 修改学校
     * @param school
     * @return
     */
    RespBean setSchool(Integer id, String school);
}
