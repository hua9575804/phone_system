package com.qianfeng.po;


import java.util.List;

public class TbType {

  private long typeId;
  private String typeName;

  private List<TbDamage> damageList;

  public List<TbDamage> getDamageList() {
    return damageList;
  }

  public void setDamageList(List<TbDamage> damageList) {
    this.damageList = damageList;
  }

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

}
