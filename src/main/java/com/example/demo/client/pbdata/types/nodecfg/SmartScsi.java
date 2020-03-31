package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartScsi {
  @JsonProperty("last_lun")
  private int lastLun;

  public int getLastLun() {
    return lastLun;
  }

  public void setLastLun(int lastLun) {
    this.lastLun = lastLun;
  }
}
