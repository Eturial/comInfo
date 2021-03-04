package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.SchoolMapper;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import com.effort.server.service.ISchoolService;
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
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 获取所有学校
     * @return
     */
    @Override
    public List<School> getSchools() {
        return schoolMapper.getSchools();
    }


    /**
     * 添加学校
     * @param school
     * @return
     */
    @Override
    public RespBean addSchool(String school) {
        School school1 = new School();
        schoolMapper.addSchool(school);
        return RespBean.success("添加成功", school1);
    }

    /**
     * 删除学校
     * @param id
     * @return
     */
    @Override
    public RespBean deleteSchool(Integer id) {
        schoolMapper.deleteById(id);
        return RespBean.success("删除成功");
    }

    /**
     * 修改学校
     * @param id
     * @param school
     * @return
     */
    @Override
    public RespBean setSchool(Integer id, String school) {
        schoolMapper.selectById(id).setSchool(school);
        return RespBean.success("修改成功");
    }


}
