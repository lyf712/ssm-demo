package com.demo.Test;

//import jdk.internal.loader.Resource;

import com.demo.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class BasicDemo {
  public static <User> void main(String args[]) throws IOException {
    String resource="Mybatisconf.xml";

    Reader reader= Resources.getResourceAsReader(resource);

    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);

    SqlSession session=sqlSessionFactory.openSession();

//    String statement="com.lyf.Dao.UserInfoDao.selectUserInfo";
    UserMapper mapper=null;
    mapper=session.getMapper(UserMapper.class);
    List <com.demo.mybatis.model.User> users =  mapper.QueryAllUsers();

    //list的使用总结
    //

    for (com.demo.mybatis.model.User u: users){
      System.out.println(u.toString());
      System.out.println(u.getId());
    }
  }
}
