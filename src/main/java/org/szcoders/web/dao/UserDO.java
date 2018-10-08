package org.szcoders.web.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户实体
 *
 * @author Suvan
 */
@Entity(name = "t_szcoders_web_user")
public class UserDO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private Date createTime;
}
