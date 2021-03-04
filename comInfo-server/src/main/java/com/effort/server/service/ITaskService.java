package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.Task;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
public interface ITaskService extends IService<Task> {

    Task getTask(Integer projectId, Integer userId);

    Task updateTask(Integer projectId, Integer userId);

    void addTask(Task task);

    void deleteTasks(Integer projectId, Integer userId);
}
