package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartNvmeLunInfoBackendTrs {
  @JsonProperty("fixed_port")
  private Integer fixedPort;
  @JsonProperty("ext_trans_addrs")
  private IpAddr[] extTransAddrs;
  @JsonProperty("ext_hostnqn")
  private String extHostNqn;
  @JsonProperty("ext_subnqn")
  private String extSubNqn;

  public Integer getFixedPort() {
    return fixedPort;
  }

  public void setFixedPort(Integer fixedPort) {
    this.fixedPort = fixedPort;
  }

  public IpAddr[] getExtTransAddrs() {
    return extTransAddrs;
  }

  public void setExtTransAddrs(IpAddr[] extTransAddrs) {
    this.extTransAddrs = extTransAddrs;
  }

  public String getExtHostNqn() {
    return extHostNqn;
  }

  public void setExtHostNqn(String extHostNqn) {
    this.extHostNqn = extHostNqn;
  }

  public String getExtSubNqn() {
    return extSubNqn;
  }

  public void setExtSubNqn(String extSubNqn) {
    this.extSubNqn = extSubNqn;
  }
}
