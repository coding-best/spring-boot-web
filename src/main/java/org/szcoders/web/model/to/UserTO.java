package org.szcoders.web.model.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体传输对象
 *
 * @author Suvan
 */
@Data
@ApiModel(value = "UserTO", description = "用户传输对象")
public class UserTO {

    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(name = "id", value = "用户 id", example = "null")
    private Integer id;

    @ApiModelProperty(name = "name", value = "用户昵称")
    private String name;

    @ApiModelProperty(name = "phone", value = "用户手机号")
    private String phone;
}
