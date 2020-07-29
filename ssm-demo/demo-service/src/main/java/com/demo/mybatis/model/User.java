package com.demo.mybatis.model;

import java.util.Date;

public class User {
  private Integer id;
  private String userName;
  private String password;
  private String department;
  private Date  registerTime;

  public User(Integer id, String userName, String password, String department, Date registerTime) {
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.department = department;
    this.registerTime = registerTime;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }


  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", userName='" + userName + '\'' +
      ", password='" + password + '\'' +
      ", department='" + department + '\'' +
      ", registerTime=" + registerTime +
      '}';
  }
}
