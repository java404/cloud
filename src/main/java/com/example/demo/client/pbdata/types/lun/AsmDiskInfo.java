package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AsmDiskInfo {
  @JsonProperty("dsknum")
  private Integer dskNum;
  @JsonProperty("grpname")
  private String grpName;
  @JsonProperty("fgname")
  private String fgName;
  @JsonProperty("lun_id")
  private String lunId;
  @JsonProperty("ext_lht")
  private Long extLht;
  @JsonProperty("ext_dskname")
  private String extDskName;
  @JsonProperty("ext_path")
  private String extPath;
  @JsonProperty("ext_mode_status")
  private String extModeStatus; // ONLINE/OFFLINE/SYNCING
  @JsonProperty("ext_state")
  private String extState; // DROPPING/NORMAL

  public Integer getDskNum() {
    return dskNum;
  }

  public void setDskNum(Integer dskNum) {
    this.dskNum = dskNum;
  }

  public String getGrpName() {
    return grpName;
  }

  public void setGrpName(String grpName) {
    this.grpName = grpName;
  }

  public String getFgName() {
    return fgName;
  }

  public void setFgName(String fgName) {
    this.fgName = fgName;
  }

  public String getLunId() {
    return lunId;
  }

  public void setLunId(String lunId) {
    this.lunId = lunId;
  }

  public Long getExtLht() {
    return extLht;
  }

  public void setExtLht(Long extLht) {
    this.extLht = extLht;
  }

  public String getExtDskName() {
    return extDskName;
  }

  public void setExtDskName(String extDskName) {
    this.extDskName = extDskName;
  }

  public String getExtPath() {
    return extPath;
  }

  public void setExtPath(String extPath) {
    this.extPath = extPath;
  }

  public String getExtModeStatus() {
    return extModeStatus;
  }

  public void setExtModeStatus(String extModeStatus) {
    this.extModeStatus = extModeStatus;
  }

  public String getExtState() {
    return extState;
  }

  public void setExtState(String extState) {
    this.extState = extState;
  }
}
