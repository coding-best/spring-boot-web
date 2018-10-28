package org.szcoders.web.model.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体传输对象
 *
 * @author Suvan
 */
@Data
@ApiModel(value = "UserVO", description = "用户视图对象")
public class UserVO {

    @ApiModelProperty(value = "用户 id")
    private Integer id;

    @ApiModelProperty(value = "用户昵称")
    private String name;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;
}
