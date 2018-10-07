package org.szcoders.web.model;

/**
 * 接口回显实体
 *
 * @author Suvan
 * @date 2018.10.07
 * @version 1.0
 */
public class ApiResult<T> {

    private int code;
    private String message;
    private T model;

    /**
     * Constructor
     */
    public ApiResult () {
    }

    /**
     * Setter
     */
    public void setCode (int code) {
        this.code = code;
    }
    public void setMessage (String message) {
        this.message = message;
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
    public String getMessage () {
        return message;
    }
    public T getModel () {
        return model;
    }
}
