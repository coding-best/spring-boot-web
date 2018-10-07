package org.szcoders.web.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 公共参数线程局部变量
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.0
 */
public class PublicParamsThreadLocal {

    private static ThreadLocal<HttpServletRequest> httpRequest = new ThreadLocal<>();
    private static ThreadLocal<HttpServletResponse> httpResponse= new ThreadLocal<>();

    /**
     * Setter
     */
    public static void setHttpRequest (HttpServletRequest httpRequest) {
        PublicParamsThreadLocal.httpRequest.set(httpRequest);
    }
    public static void setHttpResponse (HttpServletResponse httpResponse) {
        PublicParamsThreadLocal.httpResponse.set(httpResponse);
    }

    /**
     * Getter
     */
    public static HttpServletRequest getHttpRequest () {
        return httpRequest.get();
    }

    public static HttpServletResponse getHttpResponse () {
        return httpResponse.get();
    }

    /**
     * Clear
     */
    public static void clearAll() {
        httpRequest.remove();
        httpResponse.remove();
    }
}
