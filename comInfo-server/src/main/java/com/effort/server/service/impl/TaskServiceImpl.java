package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.MemberMapper;
import com.effort.server.mapper.TaskMapper;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.Task;
import com.effort.server.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public Task getTask(Integer projectId, Integer userId) {
        return taskMapper.selectTask(projectId, userId);
    }

//    @Override
//    public Task updateTask(Integer projectId, Integer userId) {
//        Task task = getTask(projectId, userId);
//        taskMapper.updateById(task);
//        return task;
//    }

    @Override
    public void addTask(Task task) {
        taskMapper.insert(task);
    }

//    @Override
//    public void deleteTasks(Integer projectId, Integer userId) {
//        taskMapper.deleteTask(projectId, userId);
//    }
}
