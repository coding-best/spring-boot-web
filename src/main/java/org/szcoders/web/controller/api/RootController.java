package org.szcoders.web.controller.api;

import java.io.IOException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.apache.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.szcoders.web.utils.PublicParamsThreadLocal;

/**
 * 根路径导航接口
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "root", description = "根路径导航接口")
public class RootController {

    @RequestMapping(value = "/swagger", method = RequestMethod.GET)
    @ApiOperation(value = "访问接口文档", httpMethod = "GET")
    @ApiResponse(code = HttpStatus.SC_OK, message = "success")
    public void redirectSwaggerUIHtml() throws IOException {
        PublicParamsThreadLocal.getHttpResponse().sendRedirect("/swagger-ui.html");
    }
}
