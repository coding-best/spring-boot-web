package org.szcoders.web.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.szcoders.web.model.ApiResult;
import org.szcoders.web.model.to.UserTO;
import org.szcoders.web.model.vo.UserVO;
import org.szcoders.web.service.UserService;

/**
 * 用户管理相关接口
 *
 * @author Suvan
 * @date 2018.10.28
 * @version 1.1
 */
@RequestMapping(value = "/api/v1/user/manager/", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@Api(tags = "User", description = "用户模块")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    @ApiOperation(value = "保存用户", httpMethod = "POST")
    @ApiImplicitParam(name = "user", value = "用户传输对象", paramType = "body",
                      dataType = "UserTO")
    @ApiResponses(@ApiResponse(code = 0, message = "success", response = ApiResult.class))
    public ApiResult addUser(@RequestBody UserTO user) {
        userService.save(user);
        return ApiResult.success();
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ApiOperation(value = "id 查询用户", httpMethod = "GET")
    @ApiImplicitParam(name = "id", value = "用户 id", paramType = "query", required = true)
    @ApiResponses(@ApiResponse(code = 0, message = "success", response = ApiResult.class))
    public ApiResult<UserVO> queryUser(Integer id) {
        UserVO userVO = userService.getVO(id);
        return new ApiResult<>(0, "success", userVO);
    }
}
