package com.effort.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "t_member", resultMap = "MemberBaseResultMap")
@ApiModel(value="Member对象", description="")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Race race;

    @TableField("project_name")
    private String projectName;

    private User member1;

    private User member2;

    private User member3;

    private User member4;

    private User member5;


}
