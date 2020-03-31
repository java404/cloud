package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LunInfo {
  @JsonProperty("lun_name")
  private String lunName;
  @JsonProperty("lun_id")
  private String lunId;
  @JsonProperty("lun_type")
  private Integer lunType;
  @JsonProperty("lun_res_id")
  private String lunResId;
  @JsonProperty("state_cfg")
  private Long stateCfg;
  @JsonProperty("initgroup_id")
  private String initGroupId;
  @JsonProperty("lun_size")
  private Long lunSize;
  @JsonProperty("asmdisk_info")
  private AsmDiskInfo asmdiskInfo;
  @JsonProperty("backend_trs")
  private LunInfoBackendTrs backendTrs;
  @JsonProperty("ext_state_onl")
  private Long extStateOnl;
  @JsonProperty("ext_device_path")
  private String extDevicePath;
  @JsonProperty("ext_node_name")
  private String extNodeName;
  @JsonProperty("ext_initgroup_name")
  private String extInitGroupName;
  @JsonProperty("ext_backend_res")
  private LunInfoBackendRes extBackendRes;
  @JsonProperty("ext_state")
  private Integer extState;
  @JsonProperty("ext_state_level")
  private Integer extStateLevel;

  public String getLunName() {
    return lunName;
  }

  public void setLunName(String lunName) {
    this.lunName = lunName;
  }

  public String getLunId() {
    return lunId;
  }

  public void setLunId(String lunId) {
    this.lunId = lunId;
  }

  public Integer getLunType() {
    return lunType;
  }

  public void setLunType(Integer lunType) {
    this.lunType = lunType;
  }

  public String getLunResId() {
    return lunResId;
  }

  public void setLunResId(String lunResId) {
    this.lunResId = lunResId;
  }

  public Long getStateCfg() {
    return stateCfg;
  }

  public void setStateCfg(Long stateCfg) {
    this.stateCfg = stateCfg;
  }

  public String getInitGroupId() {
    return initGroupId;
  }

  public void setInitGroupId(String initGroupId) {
    this.initGroupId = initGroupId;
  }

  public Long getLunSize() {
    return lunSize;
  }

  public void setLunSize(Long lunSize) {
    this.lunSize = lunSize;
  }

  public AsmDiskInfo getAsmdiskInfo() {
    return asmdiskInfo;
  }

  public void setAsmdiskInfo(AsmDiskInfo asmdiskInfo) {
    this.asmdiskInfo = asmdiskInfo;
  }

  public LunInfoBackendTrs getBackendTrs() {
    return backendTrs;
  }

  public void setBackendTrs(LunInfoBackendTrs backendTrs) {
    this.backendTrs = backendTrs;
  }

  public Long getExtStateOnl() {
    return extStateOnl;
  }

  public void setExtStateOnl(Long extStateOnl) {
    this.extStateOnl = extStateOnl;
  }

  public String getExtDevicePath() {
    return extDevicePath;
  }

  public void setExtDevicePath(String extDevicePath) {
    this.extDevicePath = extDevicePath;
  }

  public String getExtNodeName() {
    return extNodeName;
  }

  public void setExtNodeName(String extNodeName) {
    this.extNodeName = extNodeName;
  }

  public String getExtInitGroupName() {
    return extInitGroupName;
  }

  public void setExtInitGroupName(String extInitGroupName) {
    this.extInitGroupName = extInitGroupName;
  }

  public LunInfoBackendRes getExtBackendRes() {
    return extBackendRes;
  }

  public void setExtBackendRes(LunInfoBackendRes extBackendRes) {
    this.extBackendRes = extBackendRes;
  }

  public Integer getExtState() {
    return extState;
  }

  public void setExtState(Integer extState) {
    this.extState = extState;
  }

  public Integer getExtStateLevel() {
    return extStateLevel;
  }

  public void setExtStateLevel(Integer extStateLevel) {
    this.extStateLevel = extStateLevel;
  }
}
