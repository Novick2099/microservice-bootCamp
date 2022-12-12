package com.example.microservicetrainingby.model;

import java.util.Date;

public class Availability {

  private String storeId;

  private String productid;

  private double availQty;

  private Date launchDate;

  public Availability() {
  }

  public Availability(String storeId, String productid, double availQty, Date launchDate) {
    this.storeId = storeId;
    this.productid = productid;
    this.availQty = availQty;
    this.launchDate = launchDate;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public String getProductid() {
    return productid;
  }

  public void setProductid(String productid) {
    this.productid = productid;
  }

  public double getAvailQty() {
    return availQty;
  }

  public void setAvailQty(double availQty) {
    this.availQty = availQty;
  }

  public Date getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(Date launchDate) {
    this.launchDate = launchDate;
  }
}
