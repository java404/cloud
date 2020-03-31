package com.example.demo.client.pbdata.types.group;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartScsiInitGroupNodeBackendTrs {
  @JsonProperty("ibguids")
  private String[] ibGuids;

  public String[] getIbGuids() {
    return ibGuids;
  }

  public void setIbGuids(String[] ibGuids) {
    this.ibGuids = ibGuids;
  }
}
