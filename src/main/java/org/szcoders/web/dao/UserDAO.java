package org.szcoders.web.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.szcoders.web.dao.db.UserDO;
import org.szcoders.web.dao.db.repository.UserRepository;

/**
 * 用户数据操作层
 *
 * @author Suvan
 */
@Repository
public class UserDAO {

    private final UserRepository userRepository;

    @Autowired
    public UserDAO (UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void saveDO(UserDO userDO) {
        userDO.setCreateTime(new Date());
        userRepository.save(userDO);
    }

    public UserDO queryDOById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}
