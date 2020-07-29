package com.demo.service;

import com.demo.mybatis.mapper.UserMapper;
import com.demo.mybatis.mapper.XyMapper;
import com.demo.mybatis.model.User;
import com.demo.mybatis.model.Xy;
import com.demo.mybatis.model.Xy2;
import com.thoughtworks.xstream.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Connection {

  private static Object Null;

  public static void main(String args[]) throws IOException {
//    checklogin("0000");

    Xy xy=new Xy();
    xy.setDate("2020-7-8");
    xy.setX("2");
    xy.setY("4");
//    XyTest(xy);
//    test4(xy);
//    test2();
//    test3();
  }

 public static SqlSession connect() throws IOException {
   String resource="Mybatisconf.xml";

   Reader reader= Resources.getResourceAsReader(resource);

   SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);

   //mysql自增主键，记得加true
   SqlSession session=sqlSessionFactory.openSession(true);

////    String statement="com.lyf.Dao.UserInfoDao.selectUserInfo";
//   UserMapper mapper=null;
////   mapper=session.getMapper(UserMapper.class);
//
//   mapper=session.getMapper(UserMapper.class);
//   return mapper;
   return session;
 }

 public static void test() throws IOException {

//   User user=connect().retrieveUserById(10001);
//   System.out.println(user.getPassword());

 }

 public static  String checklogin(String id) throws IOException {

     //    String statement="com.lyf.Dao.UserInfoDao.selectUserInfo";
   UserMapper mapper=null;
//   mapper=session.getMapper(UserMapper.class);

   mapper=connect().getMapper(UserMapper.class);


    if(mapper.retrieveUserById(id) == (User) Null){
      System.out.println("noUser");
      return "noUser";
    }
    String result=mapper.retrieveUserById(id).getPassword();
    System.out.println(result);
    return result;
 }


  public static  void XyTest(Xy xy) throws IOException {
    XyMapper xyMapper=connect().getMapper(XyMapper.class);

    xyMapper.Update(xy);
  }

  public static  void XyTest2(Xy2 xy) throws IOException {
    XyMapper xyMapper=connect().getMapper(XyMapper.class);

    xyMapper.Update3(xy);
  }

  public static void test2() throws IOException {
    XyMapper xyMapper=connect().getMapper(XyMapper.class);



    System.out.println(xyMapper.result().getX());
  }

  public static void test3() throws IOException {
    XyMapper xyMapper=connect().getMapper(XyMapper.class);
    xyMapper.Update2("2020-7-7","4","5");
    connect().commit();
    connect().close();
    System.out.println("yes");
  }
  public static Xy test4() throws IOException {
    XyMapper xyMapper=connect().getMapper(XyMapper.class);

    return xyMapper.result();
  }
}
