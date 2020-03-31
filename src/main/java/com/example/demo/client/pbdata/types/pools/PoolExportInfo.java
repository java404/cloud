package com.example.demo.client.pbdata.types.pools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoolExportInfo {
  @JsonProperty("pool_name")
  private String poolName;
  @JsonProperty("state_str")
  private String stateStr;
  @JsonProperty("valid")
  private Long valid;
  @JsonProperty("p_valid")
  private Double poolValid;
  @JsonProperty("dirty")
  private Long dirty;
  @JsonProperty("p_dirty")
  private Double poolDirty;
  @JsonProperty("error")
  private Long error;
  @JsonProperty("lower_thresh")
  private Long lowerThresh;
  @JsonProperty("p_lower_thresh")
  private Integer poolLowerThresh;
  @JsonProperty("upper_thresh")
  private Long upperThresh;
  @JsonProperty("p_upper_thresh")
  private Integer poolUpperThresh;
  @JsonProperty("size")
  private Long size;
  @JsonProperty("max_size")
  private Long maxSize;
  @JsonProperty("dev_name")
  private String[] devName;
  @JsonProperty("extent")
  private Long extent;
  @JsonProperty("bucket")
  private Long bucket;
  @JsonProperty("sippet")
  private Long sippet;
  @JsonProperty("state")
  private Integer state;
  @JsonProperty("state_exp")
  private String stateExp;
  @JsonProperty("is_variable")
  private Boolean isVariable;

  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }

  public String getStateStr() {
    return stateStr;
  }

  public void setStateStr(String stateStr) {
    this.stateStr = stateStr;
  }

  public Long getValid() {
    return valid;
  }

  public void setValid(Long valid) {
    this.valid = valid;
  }

  public Double getPoolValid() {
    return poolValid;
  }

  public void setPoolValid(Double poolValid) {
    this.poolValid = poolValid;
  }

  public Long getDirty() {
    return dirty;
  }

  public void setDirty(Long dirty) {
    this.dirty = dirty;
  }

  public Double getPoolDirty() {
    return poolDirty;
  }

  public void setPoolDirty(Double poolDirty) {
    this.poolDirty = poolDirty;
  }

  public Long getError() {
    return error;
  }

  public void setError(Long error) {
    this.error = error;
  }

  public Long getLowerThresh() {
    return lowerThresh;
  }

  public void setLowerThresh(Long lowerThresh) {
    this.lowerThresh = lowerThresh;
  }

  public Integer getPoolLowerThresh() {
    return poolLowerThresh;
  }

  public void setPoolLowerThresh(Integer poolLowerThresh) {
    this.poolLowerThresh = poolLowerThresh;
  }

  public Long getUpperThresh() {
    return upperThresh;
  }

  public void setUpperThresh(Long upperThresh) {
    this.upperThresh = upperThresh;
  }

  public Integer getPoolUpperThresh() {
    return poolUpperThresh;
  }

  public void setPoolUpperThresh(Integer poolUpperThresh) {
    this.poolUpperThresh = poolUpperThresh;
  }

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public String[] getDevName() {
    return devName;
  }

  public void setDevName(String[] devName) {
    this.devName = devName;
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

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getStateExp() {
    return stateExp;
  }

  public void setStateExp(String stateExp) {
    this.stateExp = stateExp;
  }

  public Boolean getIsVariable() {
    return isVariable;
  }

  public void setIsVariable(Boolean isVariable) {
    this.isVariable = isVariable;
  }
}
