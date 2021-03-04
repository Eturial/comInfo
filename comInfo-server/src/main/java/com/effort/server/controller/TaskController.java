package com.effort.server.controller;


import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.Task;
import com.effort.server.pojo.User;
import com.effort.server.service.ITaskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @ApiOperation(value = "获取小组任务")
    @GetMapping("/task/{project_id}/{user_id}")
    public Task getTasks(@PathVariable("project_id") Integer projectId,@PathVariable("user_id") Integer userId) {
        return taskService.getTask(projectId, userId);
    }

    @ApiOperation(value = "修改小组任务")
    @PostMapping("/task/{project_id}/{user_id}")
    public RespBean updateTasks(@PathVariable("project_id") Integer projectId, @PathVariable("user_id") Integer userId) {
        taskService.updateTask(projectId, userId);
        return RespBean.success("修改成功");
    }

    @ApiOperation(value = "新增小组任务")
    @PutMapping("/task")
    public RespBean addTasks(@RequestBody Task task) {
        taskService.addTask(task);
        return RespBean.success("添加成功");
    }

    @ApiOperation(value = "删除小组任务")
    @PostMapping("/task/{project_id}/{user_id}")
    public RespBean deleteTasks(@PathVariable("project_id") Integer projectId, @PathVariable("user_id") Integer userId) {
        taskService.deleteTasks(projectId, userId);
        return RespBean.success("删除成功");
    }
}
