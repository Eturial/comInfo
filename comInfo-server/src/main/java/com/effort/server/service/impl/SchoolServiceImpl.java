package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.SchoolMapper;
import com.effort.server.pojo.School;
import com.effort.server.service.ISchoolService;
import org.springframework.stereotype.Service;

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

    {
        getBaseMapper().selectById("");
    }
}
