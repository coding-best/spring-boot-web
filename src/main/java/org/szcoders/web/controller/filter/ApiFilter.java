package org.szcoders.web.controller.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.szcoders.web.utils.PublicParamsThreadLocal;

/**
 * API 请求过滤器
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.0
 */
@WebFilter(filterName = "ApiFilter", urlPatterns = "/api/*")
public class ApiFilter implements Filter {

    @Override
    public void init (FilterConfig filterConfig) { }

    @Override
    public void doFilter (ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        PublicParamsThreadLocal.setHttpRequest(httpRequest);
        PublicParamsThreadLocal.setHttpResponse(httpServletResponse);

        filterChain.doFilter(servletRequest, servletResponse);

        PublicParamsThreadLocal.clearAll();
    }

    @Override
    public void destroy () { }
}
