package com.example.demo.client.pbdata.types.pools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoolDiskInfo {
  @JsonProperty("disk_id")
  private String diskId;
  @JsonProperty("disk_part")
  private Integer diskPart;
  @JsonProperty("ext_dev_name")
  private String extDevName;
  @JsonProperty("ext_disk_name")
  private String extDiskName;
  @JsonProperty("ext_size")
  private Long extSize;

  public String getDiskId() {
    return diskId;
  }

  public void setDiskId(String diskId) {
    this.diskId = diskId;
  }

  public Integer getDiskPart() {
    return diskPart;
  }

  public void setDiskPart(Integer diskPart) {
    this.diskPart = diskPart;
  }

  public String getExtDevName() {
    return extDevName;
  }

  public void setExtDevName(String extDevName) {
    this.extDevName = extDevName;
  }

  public String getExtDiskName() {
    return extDiskName;
  }

  public void setExtDiskName(String extDiskName) {
    this.extDiskName = extDiskName;
  }

  public Long getExtSize() {
    return extSize;
  }

  public void setExtSize(Long extSize) {
    this.extSize = extSize;
  }
}
