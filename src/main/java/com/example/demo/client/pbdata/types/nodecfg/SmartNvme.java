package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartNvme {
  @JsonProperty("last_port")
  private int lastPort;

  public int getLastPort() {
    return lastPort;
  }

  public void setLastPort(int lastPort) {
    this.lastPort = lastPort;
  }
}
