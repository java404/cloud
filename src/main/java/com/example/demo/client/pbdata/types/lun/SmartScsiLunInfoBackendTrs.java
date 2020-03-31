package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartScsiLunInfoBackendTrs {
  @JsonProperty("fixed_lun")
  private Integer fixedLun;
  @JsonProperty("ext_io_error")
  private Long extIoError;
  @JsonProperty("ext_last_errno")
  private Integer extLastErrno;

  public Integer getFixedLun() {
    return fixedLun;
  }

  public void setFixedLun(Integer fixedLun) {
    this.fixedLun = fixedLun;
  }

  public Long getExtIoError() {
    return extIoError;
  }

  public void setExtIoError(Long extIoError) {
    this.extIoError = extIoError;
  }

  public Integer getExtLastErrno() {
    return extLastErrno;
  }

  public void setExtLastErrno(Integer extLastErrno) {
    this.extLastErrno = extLastErrno;
  }
}
