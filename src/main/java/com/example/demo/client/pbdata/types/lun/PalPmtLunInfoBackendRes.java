package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalPmtLunInfoBackendRes {
  @JsonProperty("data_dev_name")
  private String dataDevName;
  @JsonProperty("data_disk_name")
  private String dataDiskName;
  @JsonProperty("pool_name")
  private String poolName;

  public String getDataDevName() {
    return dataDevName;
  }

  public void setDataDevName(String dataDevName) {
    this.dataDevName = dataDevName;
  }

  public String getDataDiskName() {
    return dataDiskName;
  }

  public void setDataDiskName(String dataDiskName) {
    this.dataDiskName = dataDiskName;
  }

  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }
}
