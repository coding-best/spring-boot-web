package org.szcoders.web.service;

import org.szcoders.web.model.to.UserTO;
import org.szcoders.web.model.vo.UserVO;

/**
 * 用户服务接口
*
 * @author Suvan
 * @date 2018.10.28
 * @version 1.0
 */
public interface UserService {

    /**
     * 保存用户信息
     *
     * @param userTO 用户传输对象
     */
    void save(UserTO userTO);

    /**
     * 根据 id，查询用户信息
     *
     * @param id 用户 id
     * @return
     */
    UserVO getVO(Integer id);
}

