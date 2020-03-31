package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LunInfoBackendRes {
  @JsonProperty("ext:pds.backend.lun.basedev.li_br")
  private BaseDevLunInfoBackendRes baseDevLiBr;
  @JsonProperty("ext:pds.backend.lun.basedisk.li_br")
  private BaseDiskLunInfoBackendRes baseDiskLiBr;
  @JsonProperty("ext:pds.backend.lun.palcache.li_br")
  private PalCacheLunInfoBackendRes palcacheLiBr;
  @JsonProperty("ext:pds.backend.lun.palpmt.li_br")
  private PalPmtLunInfoBackendRes palpmtLiBr;
  @JsonProperty("ext:pds.backend.lun.palraw.li_br")
  private PalRawLunInfoBackendRes palRawLiBr;

  public BaseDevLunInfoBackendRes getBaseDevLiBr() {
    return baseDevLiBr;
  }

  public void setBaseDevLiBr(BaseDevLunInfoBackendRes baseDevLiBr) {
    this.baseDevLiBr = baseDevLiBr;
  }

  public BaseDiskLunInfoBackendRes getBaseDiskLiBr() {
    return baseDiskLiBr;
  }

  public void setBaseDiskLiBr(BaseDiskLunInfoBackendRes baseDiskLiBr) {
    this.baseDiskLiBr = baseDiskLiBr;
  }

  public PalCacheLunInfoBackendRes getPalcacheLiBr() {
    return palcacheLiBr;
  }

  public void setPalcacheLiBr(PalCacheLunInfoBackendRes palcacheLiBr) {
    this.palcacheLiBr = palcacheLiBr;
  }

  public PalPmtLunInfoBackendRes getPalpmtLiBr() {
    return palpmtLiBr;
  }

  public void setPalpmtLiBr(PalPmtLunInfoBackendRes palpmtLiBr) {
    this.palpmtLiBr = palpmtLiBr;
  }

  public PalRawLunInfoBackendRes getPalRawLiBr() {
    return palRawLiBr;
  }

  public void setPalRawLiBr(PalRawLunInfoBackendRes palRawLiBr) {
    this.palRawLiBr = palRawLiBr;
  }

  /** Get data disk name. */
  public String getDataDiskName() {
    if (baseDevLiBr != null) {
      return null;
    } else if (baseDiskLiBr != null) {
      return baseDiskLiBr.getDataDiskName();
    } else if (palcacheLiBr != null) {
      return palcacheLiBr.getDataDiskName();
    } else if (palpmtLiBr != null) {
      return palpmtLiBr.getDataDiskName();
    } else if (palRawLiBr != null) {
      return palRawLiBr.getDataDiskName();
    }
    return null;
  }

  /** Get data dev name. */
  public String getDataDevName() {
    if (baseDevLiBr != null) {
      return baseDevLiBr.getDevName();
    } else if (baseDiskLiBr != null) {
      return baseDiskLiBr.getDataDevName();
    } else if (palcacheLiBr != null) {
      return palcacheLiBr.getDataDevName();
    } else if (palpmtLiBr != null) {
      return palpmtLiBr.getDataDevName();
    } else if (palRawLiBr != null) {
      return palRawLiBr.getDataDevName();
    }
    return null;
  }
}
