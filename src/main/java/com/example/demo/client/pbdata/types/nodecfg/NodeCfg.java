package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NodeCfg {
  @JsonProperty("node_name")
  private String nodeName;
  @JsonProperty("cluster_name")
  private String clusterName;
  @JsonProperty("trs_type")
  private int trsType;
  @JsonProperty("last_target")
  private int lastTarget;
  @JsonProperty("ext_ib_ips")
  private String[] extIbIps;
  @JsonProperty("backend_trs")
  private IosNodeCfgBackendTransport backendTrs;

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public int getTrsType() {
    return trsType;
  }

  public void setTrsType(int trsType) {
    this.trsType = trsType;
  }

  public int getLastTarget() {
    return lastTarget;
  }

  public void setLastTarget(int lastTarget) {
    this.lastTarget = lastTarget;
  }

  public String[] getExtIbIps() {
    return extIbIps;
  }

  public void setExtIbIps(String[] extIbIps) {
    this.extIbIps = extIbIps;
  }

  public IosNodeCfgBackendTransport getBackendTrs() {
    return backendTrs;
  }

  public void setBackendTrs(IosNodeCfgBackendTransport backendTrs) {
    this.backendTrs = backendTrs;
  }
}
