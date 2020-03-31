package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BacNodeInfo {
  @JsonProperty("initgroup_id")
  private String initGroupId;
  @JsonProperty("initgroup_name")
  private String initGroupName;

  public String getInitGroupId() {
    return initGroupId;
  }

  public void setInitGroupId(String initGroupId) {
    this.initGroupId = initGroupId;
  }

  public String getInitGroupName() {
    return initGroupName;
  }

  public void setInitGroupName(String initGroupName) {
    this.initGroupName = initGroupName;
  }
}
