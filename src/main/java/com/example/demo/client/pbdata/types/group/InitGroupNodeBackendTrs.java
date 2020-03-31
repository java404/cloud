package com.example.demo.client.pbdata.types.group;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitGroupNodeBackendTrs {
  @JsonProperty("ext:pds.backend.trs.smartnvme.ign_bt")
  private SmartNvmeInitGroupNodeBackendTrs backendTrsSmartnvmeIgnBt;
  @JsonProperty("ext:pds.backend.trs.smartscsi.ign_bt")
  private SmartScsiInitGroupNodeBackendTrs backendTrsSmartscsiIgnBt;

  public SmartNvmeInitGroupNodeBackendTrs getBackendTrsSmartnvmeIgnBt() {
    return backendTrsSmartnvmeIgnBt;
  }

  public void setBackendTrsSmartnvmeIgnBt(
      SmartNvmeInitGroupNodeBackendTrs backendTrsSmartnvmeIgnBt) {
    this.backendTrsSmartnvmeIgnBt = backendTrsSmartnvmeIgnBt;
  }

  public SmartScsiInitGroupNodeBackendTrs getBackendTrsSmartscsiIgnBt() {
    return backendTrsSmartscsiIgnBt;
  }

  public void setBackendTrsSmartscsiIgnBt(
      SmartScsiInitGroupNodeBackendTrs backendTrsSmartscsiIgnBt) {
    this.backendTrsSmartscsiIgnBt = backendTrsSmartscsiIgnBt;
  }
}
