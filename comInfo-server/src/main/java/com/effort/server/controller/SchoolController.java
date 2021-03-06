package com.effort.server.controller;


import com.effort.server.pojo.RespBean;
import com.effort.server.pojo.School;
import com.effort.server.service.ISchoolService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private ISchoolService schoolService;

    @ApiOperation(value = "获取学校")
    @GetMapping("/school/{id}")
    public School getSchools(@PathVariable("id") Integer id) {
        return schoolService.getById(id);
    }

    @ApiOperation(value = "获取所有学校")
    @GetMapping("/school")
    public List<School> getSchools() {
        return schoolService.getSchools();
    }

//    @ApiOperation(value = "修改学校")
//    @PostMapping("/school/{id}")
//    public RespBean updateSchool(@PathVariable("id") Integer id, String school) {
//        return schoolService.setSchool(id, school);
//    }

    @ApiOperation(value = "新增学校")
    @PutMapping("/school")
    public RespBean addSchool(@RequestBody String school) {
        return schoolService.addSchool(school);
    }

//    @ApiOperation(value = "删除学校")
//    @PostMapping("/school/{id}")
//    public RespBean deleteSchool(@PathVariable("id") Integer id) {
//        return schoolService.deleteSchool(id);
//    }

}
