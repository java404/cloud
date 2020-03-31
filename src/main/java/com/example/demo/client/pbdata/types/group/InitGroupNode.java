package com.example.demo.client.pbdata.types.group;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitGroupNode {
  @JsonProperty("node_id")
  private String nodeId;
  @JsonProperty("host_id")
  private String hostId;
  @JsonProperty("node_info")
  private String nodeInfo;
  @JsonProperty("node_name")
  private String nodeName;
  @JsonProperty("ib_ips")
  private String[] ibIps;
  @JsonProperty("listen_port")
  private Integer listenPort;
  @JsonProperty("host_name")
  private String hostName;
  @JsonProperty("trs_type")
  private Integer trsType;
  @JsonProperty("backend_trs")
  private InitGroupNodeBackendTrs backendTrs;

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

  public String getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(String nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String[] getIbIps() {
    return ibIps;
  }

  public void setIbIps(String[] ibIps) {
    this.ibIps = ibIps;
  }

  public Integer getListenPort() {
    return listenPort;
  }

  public void setListenPort(Integer listenPort) {
    this.listenPort = listenPort;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Integer getTrsType() {
    return trsType;
  }

  public void setTrsType(Integer trsType) {
    this.trsType = trsType;
  }

  public InitGroupNodeBackendTrs getBackendTrs() {
    return backendTrs;
  }

  public void setBackendTrs(InitGroupNodeBackendTrs backendTrs) {
    this.backendTrs = backendTrs;
  }
}
