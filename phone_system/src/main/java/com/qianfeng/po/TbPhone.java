package com.qianfeng.po;


public class TbPhone {

  private long phoneId;
  private String phoneInfo;
  private String phoneImage;
  private long phonePrice;
  private long brankId;


  public long getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(long phoneId) {
    this.phoneId = phoneId;
  }


  public String getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(String phoneInfo) {
    this.phoneInfo = phoneInfo;
  }


  public String getPhoneImage() {
    return phoneImage;
  }

  public void setPhoneImage(String phoneImage) {
    this.phoneImage = phoneImage;
  }


  public long getPhonePrice() {
    return phonePrice;
  }

  public void setPhonePrice(long phonePrice) {
    this.phonePrice = phonePrice;
  }


  public long getBrankId() {
    return brankId;
  }

  public void setBrankId(long brankId) {
    this.brankId = brankId;
  }

  @Override
  public String toString() {
    return "TbPhone{" +
            "phoneId=" + phoneId +
            ", phoneInfo='" + phoneInfo + '\'' +
            ", phoneImage='" + phoneImage + '\'' +
            ", phonePrice=" + phonePrice +
            ", brankId=" + brankId +
            '}';
  }
}
