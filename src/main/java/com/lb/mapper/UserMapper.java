package com.lb.mapper;

import com.lb.model.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author 李彪(libiao)
 * 2019/10/12   10:02
 */
public interface UserMapper {
     @Insert("insert into USER(account_id, name, token, create_date, gmt_modified) values (#{accountId},#{name},#{token},#{createTime},#{getModifie})")
     int insert(User user);
}
