package com.example.demo.repositories;

import com.example.demo.models.User;
import java.util.List;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
  @Select("select * from user")
  List<User> selectAll();

  @Select({ "select * from user", "where id = #{id}" })
  User selectByPrimaryKey(Long id);

  @Insert(
    { "insert into user(user_name, email)", "values(#{userName}, #{email})" }
  )
  int insert(User user);

  @Update(
    {
      "update user",
      "set user_name = #{userName}, email = #{email}",
      "where id = #{id}",
    }
  )
  int updateByPrimaryKey(User user);

  @Delete({ "delete from user", "where id = #{id}" })
  int deleteByPrimaryKey(Long id);
}
