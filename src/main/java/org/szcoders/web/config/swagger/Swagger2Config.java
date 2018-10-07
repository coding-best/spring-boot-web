package org.szcoders.web.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 接口文档配置
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createApiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.szcoders.web.controller.api"))
                .paths(PathSelectors.any())
                .build();
    }

    /*
     * ***********************************************
     * private method
     * ***********************************************
     */

    /**
     * 构建 Api 首页展示信息
     *
     * @return ApiInfo 构建信息实体
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("Spring-Boot-Web 使用 Swagger2 构建 RESTFul APIs")
                .description("szcoders 接口文档")
                .version("Suvan")
                .version("1.0")
                .build();
    }
}
