package com.example.demo.client.pbdata.types.group;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataInitGroupInfo {

  @JsonProperty("initgroup_id")
  private String initGroupId;
  @JsonProperty("initgroup_name")
  private String initGroupName;
  @JsonProperty("initgroup_info")
  private String initGroupInfo;
  @JsonProperty("initgroup_nodes")
  private InitGroupNode[] initGroupNodes;
  @JsonProperty("ext_asm_node_id")
  private String extAsmNodeId;
  @JsonProperty("ext_asm_node_name")
  private String extAsmNodeName;

  public String getInitGroupId() {
    return initGroupId;
  }

  public void setInitGroupId(String initGroupId) {
    this.initGroupId = initGroupId;
  }

  public String getInitGroupName() {
    return initGroupName;
  }

  public void setInitGroupName(String initGroupName) {
    this.initGroupName = initGroupName;
  }

  public String getInitGroupInfo() {
    return initGroupInfo;
  }

  public void setInitGroupInfo(String initGroupInfo) {
    this.initGroupInfo = initGroupInfo;
  }

  public InitGroupNode[] getInitGroupNodes() {
    return initGroupNodes;
  }

  public void setInitGroupNodes(InitGroupNode[] initGroupNodes) {
    this.initGroupNodes = initGroupNodes;
  }

  public String getExtAsmNodeId() {
    return extAsmNodeId;
  }

  public void setExtAsmNodeId(String extAsmNodeId) {
    this.extAsmNodeId = extAsmNodeId;
  }

  public String getExtAsmNodeName() {
    return extAsmNodeName;
  }

  public void setExtAsmNodeName(String extAsmNodeName) {
    this.extAsmNodeName = extAsmNodeName;
  }
}
