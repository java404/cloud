package com.example.demo.client.pbdata.types.nodecfg;

import com.example.demo.client.pbdata.types.PbdataVersion;
import com.example.demo.client.pbdata.types.constant.PbdataStorageConstants;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataNodeListItem {
  public static final String KEY_NODE_LIST_V3_0 = "get_node_list_response";
  public static final String KEY_NODE_LIST_V3_2 = "ext:pds.ios.get_node_list_response";
  @JsonProperty("nsnode_infos")
  private PbdataNodeInfo[] nsNodeInfos;
  @JsonProperty("node_infos")
  private PbdataNodeInfo[] nodeInfos;
  @JsonProperty("local_host_id")
  private String localHostId;

  public PbdataNodeInfo[] getNsNodeInfos() {
    return nsNodeInfos;
  }

  public void setNsNodeInfos(PbdataNodeInfo[] nsNodeInfos) {
    this.nsNodeInfos = nsNodeInfos;
  }

  public PbdataNodeInfo[] getNodeInfos() {
    return nodeInfos;
  }

  /** Get node infos. */
  public PbdataNodeInfo[] getNodeInfos(PbdataVersion version) {
    if (PbdataStorageConstants.compareVersion(version, PbdataStorageConstants.V3_2)) {
      return nodeInfos;
    } else {
      return nsNodeInfos;
    }
  }

  public void setNodeInfos(PbdataNodeInfo[] nodeInfos) {
    this.nodeInfos = nodeInfos;
  }

  public String getLocalHostId() {
    return localHostId;
  }

  public void setLocalHostId(String localHostId) {
    this.localHostId = localHostId;
  }

  /** Get node list. */
  public static String getKeyNodeList(PbdataVersion version) {
    if (PbdataStorageConstants.compareVersion(version, PbdataStorageConstants.V3_2)) {
      return KEY_NODE_LIST_V3_2;
    } else {
      return KEY_NODE_LIST_V3_0;
    }
  }
}
