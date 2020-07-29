package com.demo.Controller;

import com.demo.mybatis.model.JsonSeralize;
import com.demo.mybatis.model.Xy;
import com.demo.mybatis.model.Xy2;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.service.Connection;
import com.demo.mybatis.model.JsonSeralize;

import java.io.IOException;
import java.lang.reflect.Array;

@Controller
@RequestMapping("/demo/api")
public class XyController {

@RequestMapping(value = "/xyCommit",method = RequestMethod.POST)
  @CrossOrigin
  @ResponseBody
  public Xy action(String Date,String X,String Y) throws IOException {
  Xy xy=new Xy(Date,X,Y);
  //插入更新
  Connection connection=new Connection();
  connection.XyTest(xy);

  //传回
  xy.setDate(connection.test4().getDate());
  xy.setX(connection.test4().getX());
  xy.setY(connection.test4().getY());

  return xy;
}


  @RequestMapping(value = "/xyCommit2",method = RequestMethod.POST)
  @CrossOrigin
  @ResponseBody
  public Xy action2(Xy xy) throws IOException {

    //插入更新
    Connection connection=new Connection();
    connection.XyTest(xy);

    //传回
    xy.setDate(connection.test4().getDate());
    xy.setX(connection.test4().getX());
    xy.setY(connection.test4().getY());

    return xy;
  }
//JSON字符串
  @RequestMapping(value = "/xyCommit5",method = RequestMethod.POST)
  @CrossOrigin
  @ResponseBody
  public String action5(Xy xy) throws IOException {

    //插入更新
    Connection connection=new Connection();
    connection.XyTest(xy);

    //传回
    xy.setDate(connection.test4().getDate());
    xy.setX(connection.test4().getX());
    xy.setY(connection.test4().getY());
    String xyjson =new JsonSeralize().serialize(xy);
    return xyjson;
  }


//  @RequestMapping(value = "/xyCommit4",method = RequestMethod.POST)
//  @CrossOrigin
//  @ResponseBody
//  public static String action4(Xy2 xy) throws IOException {
//
//    //插入更新
//    Connection connection=new Connection();
//    connection.XyTest2(xy);
//
//    //传回
//    xy.setDate(connection.test4().getDate());
//    xy.setX(connection.test4().getX());
//    xy.setY(connection.test4().getY());
//   String xyjson =new JsonSeralize().serialize(xy);
//
//    return xyjson;
//  }



  public static void main(String args[]) throws IOException {

  Xy2 xy=new Xy2("2020-7-12","12","3");
    System.out.println(xy);
//  System.out.println(action4(xy));
  }

}
