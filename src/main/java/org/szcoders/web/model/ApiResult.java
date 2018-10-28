package org.szcoders.web.model;

import com.google.common.collect.Maps;

/**
 * 接口回显实体
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.1
 */
public class ApiResult<T> {

    private int code;
    private String msg;
    private T model;

    /**
     * Constructor
     */
    public ApiResult (Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.model = (T) Maps.newHashMap();
    }
    public ApiResult(Integer code, String msg, T model) {
        this.code = code;
        this.msg = msg;
        this.model = model;
    }

    /**
     * Setter
     */
    public void setCode (int code) {
        this.code = code;
    }
    public void setMsg (String msg) {
        this.msg = msg;
    }
    public void setModel (T model) {
        this.model = model;
    }

    /**
     * Getter
     */
    public int getCode () {
        return code;
    }
    public String getMsg () {
        return msg;
    }
    public T getModel () {
        return model;
    }

    public static ApiResult success() {
        return new ApiResult<>(0, "success");
    }
}
