package com.demo.mybatis.mapper;

import com.demo.mybatis.model.Xy;
import com.demo.mybatis.model.Xy2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface XyMapper {

 @Select("select * from xyRecord order by Date DESC limit 1")
 public Xy result();


//注意是与get后的名对应还是属性
   @Insert("insert into XyRecord(Date,X,Y) values(#{Date},#{x},#{y})")
  public void Update(Xy xy);

  @Insert("insert into XyRecord(Date,X,Y) values(#{Date},#{x},#{y})")
  public void Update3(Xy2 xy);

  @Insert("insert into XyRecord(Date,X,Y) values(#{Date},#{X},#{Y})")
  public void Update2(@Param("Date") String Date,@Param("X")String X,@Param("Y") String y);

  @Select("select * from XyRecord where Date=#{Date}")
  public Xy result2(Xy xy);

}
