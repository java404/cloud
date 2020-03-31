package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseDevLunInfoBackendRes {
  @JsonProperty("dev_name")
  private String devName;

  public String getDevName() {
    return devName;
  }

  public void setDevName(String devName) {
    this.devName = devName;
  }
}
