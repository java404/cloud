package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataNodeInfo {
  @JsonProperty("node_id")
  private String nodeId;
  @JsonProperty("host_id")
  private String hostId;
  @JsonProperty("ib_ips")
  private String[] ibIps;
  @JsonProperty("err_ib_ips")
  private String[] errIbIps;
  @JsonProperty("listen_port")
  private Integer listenPort;
  @JsonProperty("node_name")
  private String nodeName;
  @JsonProperty("cluster_name")
  private String clusterName;
  @JsonProperty("node_type")
  private Integer nodeType;
  @JsonProperty("trs_type")
  private Integer trsType;
  @JsonProperty("host_name")
  private String hostName;
  @JsonProperty("bac")
  private BacNodeInfo bac;
  @JsonProperty("ios")
  private IosNodeInfo ios;
  @JsonProperty("actual_state")
  private Boolean actualState;

  //v3.0
  @JsonProperty("broadcast_ip")
  private String broadcastIp;
  @JsonProperty("listen_ip")
  private String listenIp;
  @JsonProperty("ibguids")
  private String[] ibGuids;
  @JsonProperty("trans_mode")
  private String transMode;
  @JsonProperty("platform")
  private String platform;
  @JsonProperty("node_status")
  private Integer nodeStatus;
  @JsonProperty("last_broadcast_time")
  private Long lastBroadcastTime;
  @JsonProperty("sys_mode")
  private String sysMode;
  @JsonProperty("node_uuid")
  private String nodeUuid;
  @JsonProperty("node_index")
  private String nodeIndex;

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

  public String[] getIbIps() {
    return ibIps;
  }

  public void setIbIps(String[] ibIps) {
    this.ibIps = ibIps;
  }

  public String[] getErrIbIps() {
    return errIbIps;
  }

  public void setErrIbIps(String[] errIbIps) {
    this.errIbIps = errIbIps;
  }

  public Integer getListenPort() {
    return listenPort;
  }

  public void setListenPort(Integer listenPort) {
    this.listenPort = listenPort;
  }

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

  public Integer getNodeType() {
    return nodeType;
  }

  public void setNodeType(Integer nodeType) {
    this.nodeType = nodeType;
  }

  public Integer getTrsType() {
    return trsType;
  }

  public void setTrsType(Integer trsType) {
    this.trsType = trsType;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public BacNodeInfo getBac() {
    return bac;
  }

  public void setBac(BacNodeInfo bac) {
    this.bac = bac;
  }

  public IosNodeInfo getIos() {
    return ios;
  }

  public void setIos(IosNodeInfo ios) {
    this.ios = ios;
  }

  public Boolean getActualState() {
    return actualState;
  }

  public void setActualState(Boolean actualState) {
    this.actualState = actualState;
  }

  public String getBroadcastIp() {
    return broadcastIp;
  }

  public void setBroadcastIp(String broadcastIp) {
    this.broadcastIp = broadcastIp;
  }

  public String getListenIp() {
    return listenIp;
  }

  public void setListenIp(String listenIp) {
    this.listenIp = listenIp;
  }

  public String[] getIbGuids() {
    return ibGuids;
  }

  public void setIbGuids(String[] ibGuids) {
    this.ibGuids = ibGuids;
  }

  public String getTransMode() {
    return transMode;
  }

  public void setTransMode(String transMode) {
    this.transMode = transMode;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Integer getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(Integer nodeStatus) {
    this.nodeStatus = nodeStatus;
  }

  public Long getLastBroadcastTime() {
    return lastBroadcastTime;
  }

  public void setLastBroadcastTime(Long lastBroadcastTime) {
    this.lastBroadcastTime = lastBroadcastTime;
  }

  public String getSysMode() {
    return sysMode;
  }

  public void setSysMode(String sysMode) {
    this.sysMode = sysMode;
  }

  public String getNodeUuid() {
    return nodeUuid;
  }

  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  public String getNodeIndex() {
    return nodeIndex;
  }

  public void setNodeIndex(String nodeIndex) {
    this.nodeIndex = nodeIndex;
  }
}
