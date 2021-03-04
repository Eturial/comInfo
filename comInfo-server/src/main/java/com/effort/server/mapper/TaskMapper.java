package com.effort.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.effort.server.pojo.Task;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

    Task selectTask(Integer projectId, Integer userId);

    void deleteTask(Integer projectId, Integer userId);
}
