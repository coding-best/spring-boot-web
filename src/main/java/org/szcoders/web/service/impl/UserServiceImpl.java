package org.szcoders.web.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szcoders.web.dao.UserDAO;
import org.szcoders.web.dao.db.UserDO;
import org.szcoders.web.model.to.UserTO;
import org.szcoders.web.model.vo.UserVO;
import org.szcoders.web.service.UserService;

/**
 * UserService 实现类
 *
 * @author Suvan
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl (UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save (UserTO userTO) {
        // JPA DAO 保存 user
        UserDO userDO = new UserDO();
            BeanUtils.copyProperties(userTO, userDO);
            userDO.setId(null);

        userDAO.saveDO(userDO);
    }

    @Override
    public UserVO getVO (Integer id) {
        Optional<UserDO> userDO = Optional.ofNullable(userDAO.queryDOById(id));

        UserVO userVO = new UserVO();
        userDO.ifPresent(u -> BeanUtils.copyProperties(u, userVO));

        return userVO;
    }
}
