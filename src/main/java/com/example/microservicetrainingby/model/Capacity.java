package com.example.microservicetrainingby.model;

import java.util.Date;

public class Capacity {

  private String storeid;

  private String productId;

  private Date launchDate;

  private Double noOfOrdersAccepted;

  public Capacity() {
  }

  public Capacity(String storeid, String productId, Date launchDate, Double noOfOrdersAccepted) {
    this.storeid = storeid;
    this.productId = productId;
    this.launchDate = launchDate;
    this.noOfOrdersAccepted = noOfOrdersAccepted;
  }

  public String getStoreid() {
    return storeid;
  }

  public void setStoreid(String storeid) {
    this.storeid = storeid;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Date getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(Date launchDate) {
    this.launchDate = launchDate;
  }

  public Double getNoOfOrdersAccepted() {
    return noOfOrdersAccepted;
  }

  public void setNoOfOrdersAccepted(Double noOfOrdersAccepted) {
    this.noOfOrdersAccepted = noOfOrdersAccepted;
  }
}
