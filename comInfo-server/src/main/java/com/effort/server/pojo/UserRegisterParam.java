package com.effort.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserRegister对象", description = "")
public class UserRegisterParam extends User{

    @ApiModelProperty(value = "重复密码", required = true)
    private String rePassword;


}
