package com.demo.mybatis.model;

import java.io.Serializable;

public class Xy2 implements Serializable {
  private String Date;
  private String x;
  private String y;

  public Xy2(String date) {
    this.Date = date;
  }

  public String getDate() {
    return Date;
  }

  public void setDate(String date) {
    this.Date = date;
  }

  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }

  public Xy2(String date, String x, String y) {
    this.Date = date;
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Xy2{" +
      "date='" + Date + '\'' +
      ", x='" + x + '\'' +
      ", y='" + y + '\'' +
      '}';
  }
}
