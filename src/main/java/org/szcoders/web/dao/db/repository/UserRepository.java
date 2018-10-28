package org.szcoders.web.dao.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.szcoders.web.dao.db.UserDO;

/**
 * 用户表增删查改
 *
 * @author Suvan
 */
public interface UserRepository extends JpaRepository<UserDO, Integer> {
}
