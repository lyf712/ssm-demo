package com.demo.mybatis.mapper;

import com.demo.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {

  @Select("select * from user")
  public List<User>QueryAllUsers();


  //注意这里只有一个参数，则#{}中的标识符可以任意取
  @Select("select * from User where id=#{param}")
  public User retrieveUserById(String id);

  // 模糊查询，使用 CONCAT('%',#{param},'%')
  @Select("select * from User where id=#{id} and name like CONCAT('%',#{name},'%')")
  public User retrieveUserByIdAndName(@Param("id")String id, @Param("name")String names);

//  @Insert("INSERT INTO user(userName,userAge,userAddress) VALUES(#{userName},"
//    + "#{userAge},#{userAddress})")
//  public void addNewUser(User user);

  @Delete("delete from user where id=#{id}")
  public void deleteUser(String id);

  @Update("update user id=#{id}, name=#{password}"
    + " where id=#{id}")
  public void updateUser(User user);


}
