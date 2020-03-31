package com.example.demo.client.pbdata.types.nodecfg;

import com.example.demo.client.pbdata.types.constant.PbdataStorageConstants;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataNodeInfoItem {
  public static final String KEY_NODE_INFO = "get_node_info_response";
  @JsonProperty("node_info")
  private PbdataNodeInfo nodeInfo;
  @JsonProperty("ios_service_stat")
  private PbdataNodeStat iosServiceStat;
  @JsonProperty("bac_service_stat")
  private PbdataNodeStat bacServiceStat;

  /** Get node info. */
  public PbdataNodeInfo getNodeInfo() {
    if (nodeInfo == null) {
      nodeInfo = new PbdataNodeInfo();
      if (iosServiceStat != null && bacServiceStat != null) {
        nodeInfo.setNodeName(iosServiceStat.getIosNodeCfg().getNodeName());
        nodeInfo.setHostId(iosServiceStat.getHostId());
        nodeInfo.setSysMode(PbdataStorageConstants.HOST_TYPE_MERGE);
      } else if (iosServiceStat != null) {
        nodeInfo.setNodeName(iosServiceStat.getIosNodeCfg().getNodeName());
        nodeInfo.setHostId(iosServiceStat.getHostId());
        nodeInfo.setSysMode(PbdataStorageConstants.HOST_TYPE_STORAGE);
      } else if (bacServiceStat != null) {
        nodeInfo.setNodeName(bacServiceStat.getBacNodeCfg().getNodeName());
        nodeInfo.setHostId(bacServiceStat.getHostId());
        nodeInfo.setSysMode(PbdataStorageConstants.HOST_TYPE_DATABASE);
      }
    }
    return nodeInfo;
  }

  public void setNodeInfo(PbdataNodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public PbdataNodeStat getIosServiceStat() {
    return iosServiceStat;
  }

  public void setIosServiceStat(PbdataNodeStat iosServiceStat) {
    this.iosServiceStat = iosServiceStat;
  }

  public PbdataNodeStat getBacServiceStat() {
    return bacServiceStat;
  }

  public void setBacServiceStat(PbdataNodeStat bacServiceStat) {
    this.bacServiceStat = bacServiceStat;
  }
}
