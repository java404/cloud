package com.example.demo.client.pbdata.types.pools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoolDirtyThresh {
  @JsonProperty("lower")
  private Integer lower;
  @JsonProperty("upper")
  private Integer upper;

  public Integer getLower() {
    return lower;
  }

  public void setLower(Integer lower) {
    this.lower = lower;
  }

  public Integer getUpper() {
    return upper;
  }

  public void setUpper(Integer upper) {
    this.upper = upper;
  }
}
