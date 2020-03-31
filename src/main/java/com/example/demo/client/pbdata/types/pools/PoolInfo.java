package com.example.demo.client.pbdata.types.pools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoolInfo {
  @JsonProperty("pool_id")
  private String poolId;
  @JsonProperty("pool_name")
  private String poolName;
  @JsonProperty("disk")
  private PoolDiskInfo disk;
  @JsonProperty("extent")
  private Long extent;
  @JsonProperty("bucket")
  private Long bucket;
  @JsonProperty("sippet")
  private Long sippet;
  @JsonProperty("dirty_thresh")
  private PoolDirtyThresh dirtyThresh;
  @JsonProperty("sync_level")
  private Integer syncLevel;
  @JsonProperty("skip_thresh")
  private Integer skipThresh;
  @JsonProperty("is_variable")
  private Boolean isVariable;
  @JsonProperty("ext_actual_state")
  private Boolean extActualState;
  @JsonProperty("ext_lht")
  private Long extLht;
  @JsonProperty("ext_pool_export_info")
  private PoolExportInfo extPoolExportInfo;
  @JsonProperty("ext_cache_model")
  private Integer extCacheModel;
  @JsonProperty("ext_pmt_size")
  private Long extPmtSize;
  @JsonProperty("ext_total_cachehit_rate")
  private Double extTotalCachehitRate;
  @JsonProperty("ext_read_cachehit_rate")
  private Double extReadCachehitRate;
  @JsonProperty("ext_write_cachehit_rate")
  private Double extWriteCachehitRate;

  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }

  public PoolDiskInfo getDisk() {
    return disk;
  }

  public void setDisk(PoolDiskInfo disk) {
    this.disk = disk;
  }

  public Long getExtent() {
    return extent;
  }

  public void setExtent(Long extent) {
    this.extent = extent;
  }

  public Long getBucket() {
    return bucket;
  }

  public void setBucket(Long bucket) {
    this.bucket = bucket;
  }

  public Long getSippet() {
    return sippet;
  }

  public void setSippet(Long sippet) {
    this.sippet = sippet;
  }

  public PoolDirtyThresh getDirtyThresh() {
    return dirtyThresh;
  }

  public void setDirtyThresh(PoolDirtyThresh dirtyThresh) {
    this.dirtyThresh = dirtyThresh;
  }

  public Integer getSyncLevel() {
    return syncLevel;
  }

  public void setSyncLevel(Integer syncLevel) {
    this.syncLevel = syncLevel;
  }

  public Integer getSkipThresh() {
    return skipThresh;
  }

  public void setSkipThresh(Integer skipThresh) {
    this.skipThresh = skipThresh;
  }

  public Boolean getIsVariable() {
    return isVariable;
  }

  public void setIsVariable(Boolean isVariable) {
    this.isVariable = isVariable;
  }

  public Boolean getExtActualState() {
    return extActualState;
  }

  public void setExtActualState(Boolean extActualState) {
    this.extActualState = extActualState;
  }

  public Long getExtLht() {
    return extLht;
  }

  public void setExtLht(Long extLht) {
    this.extLht = extLht;
  }

  public PoolExportInfo getExtPoolExportInfo() {
    return extPoolExportInfo;
  }

  public void setExtPoolExportInfo(PoolExportInfo extPoolExportInfo) {
    this.extPoolExportInfo = extPoolExportInfo;
  }

  public Integer getExtCacheModel() {
    return extCacheModel;
  }

  public void setExtCacheModel(Integer extCacheModel) {
    this.extCacheModel = extCacheModel;
  }

  public Long getExtPmtSize() {
    return extPmtSize;
  }

  public void setExtPmtSize(Long extPmtSize) {
    this.extPmtSize = extPmtSize;
  }

  public Double getExtTotalCachehitRate() {
    return extTotalCachehitRate;
  }

  public void setExtTotalCachehitRate(Double extTotalCachehitRate) {
    this.extTotalCachehitRate = extTotalCachehitRate;
  }

  public Double getExtReadCachehitRate() {
    return extReadCachehitRate;
  }

  public void setExtReadCachehitRate(Double extReadCachehitRate) {
    this.extReadCachehitRate = extReadCachehitRate;
  }

  public Double getExtWriteCachehitRate() {
    return extWriteCachehitRate;
  }

  public void setExtWriteCachehitRate(Double extWriteCachehitRate) {
    this.extWriteCachehitRate = extWriteCachehitRate;
  }
}
