package com.lb.mapper;

import com.lb.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author 李彪(libiao)
 * 2019/10/12   10:02
 */
@Mapper
public interface UserMapper {
     @Insert("insert into USER(account_id, name, token, create_date, gmt_modified) values (#{accountId},#{name},#{token},#{createTime},#{getModifie})")
     int insert(User user);

     @Select("select * from user where token = #{token}")
     User findByToken(@Param("token") String token);
}
