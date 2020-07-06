package com.veraxsystems.vxipmi.test.model;

public class SensorRec {
  String name;
  String value;
  String unit;
  String rate;

  public SensorRec(String name, String value, String unit, String rate) {
    this.name = name;
    this.value = value;
    this.unit = unit;
    this.rate = rate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }
}
