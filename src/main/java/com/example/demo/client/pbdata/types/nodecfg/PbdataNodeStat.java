package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataNodeStat {
  @JsonProperty("node_id")
  private String nodeId;
  @JsonProperty("host_id")
  private String hostId;
  @JsonProperty("is_ready")
  private boolean isReady;
  @JsonProperty("node_type")
  private int nodeType;
  @JsonProperty("ios_nodecfg")
  private NodeCfg iosNodeCfg;
  @JsonProperty("bac_nodecfg")
  private NodeCfg bacNodeCfg;

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public boolean isReady() {
    return isReady;
  }

  public void setReady(boolean ready) {
    isReady = ready;
  }

  public int getNodeType() {
    return nodeType;
  }

  public void setNodeType(int nodeType) {
    this.nodeType = nodeType;
  }

  public NodeCfg getIosNodeCfg() {
    return iosNodeCfg;
  }

  public void setIosNodeCfg(NodeCfg iosNodeCfg) {
    this.iosNodeCfg = iosNodeCfg;
  }

  public NodeCfg getBacNodeCfg() {
    return bacNodeCfg;
  }

  public void setBacNodeCfg(NodeCfg bacNodeCfg) {
    this.bacNodeCfg = bacNodeCfg;
  }
}
