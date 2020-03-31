package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalCacheLunInfoBackendRes {
  @JsonProperty("cache_size")
  private Long cacheSize;
  @JsonProperty("data_dev_name")
  private String dataDevName;
  @JsonProperty("data_disk_name")
  private String dataDiskName;
  @JsonProperty("cache_dev_name")
  private String cacheDevName;
  @JsonProperty("cache_disk_name")
  private String cacheDiskName;
  @JsonProperty("pool_name")
  private String poolName;

  public Long getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(Long cacheSize) {
    this.cacheSize = cacheSize;
  }

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

  public String getCacheDevName() {
    return cacheDevName;
  }

  public void setCacheDevName(String cacheDevName) {
    this.cacheDevName = cacheDevName;
  }

  public String getCacheDiskName() {
    return cacheDiskName;
  }

  public void setCacheDiskName(String cacheDiskName) {
    this.cacheDiskName = cacheDiskName;
  }

  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }
}
