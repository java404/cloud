package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalRawLunInfoBackendRes {
  @JsonProperty("data_dev_name")
  private String dataDevName;
  @JsonProperty("data_disk_name")
  private String dataDiskName;

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
}
