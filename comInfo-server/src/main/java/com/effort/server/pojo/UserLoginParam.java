package com.effort.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户登录实体类
 *
 * @author 86137
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserLogin对象", description = "")
public class UserLoginParam {
    @ApiModelProperty(value = "学号", required = true)
    private int id;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
