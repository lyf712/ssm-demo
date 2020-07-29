package com.demo.mybatis.model;

public class Xy {
  //There is no getter for property named 'Date' in 'class com.demo.mybatis.model.Xy'
  private String Date;
  private String x;
  private String y;

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

  public Xy() {
  }

  @Override
  public String toString() {
    return "Xy{" +
      "date='" + Date + '\'' +
      ", x='" + x + '\'' +
      ", y='" + y + '\'' +
      '}';
  }

  public Xy(String date, String x, String y) {
    Date = date;
    this.x = x;
    this.y = y;
  }
}
