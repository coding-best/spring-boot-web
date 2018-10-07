package org.szcoders.web.config.spring;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.szcoders.web.controller.filter.ApiFilter;

/**
 * Spring 上下文配置
 *
 * @author Suvan
 */
@Configuration
public class SpringContextConfig {

    @Bean
    public FilterRegistrationBean registerApiFilterBean() {
        return new FilterRegistrationBean(new ApiFilter());
    }
}
