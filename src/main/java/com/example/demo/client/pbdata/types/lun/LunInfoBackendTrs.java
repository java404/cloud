package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LunInfoBackendTrs {
  @JsonProperty("ext:pds.backend.trs.smartnvme.li_bt")
  private SmartNvmeLunInfoBackendTrs backendTrsSmartNvmeLiBt;
  @JsonProperty("ext:pds.backend.trs.smartscsi.li_bt")
  private SmartScsiLunInfoBackendTrs backendTrsSmartscsiLiBt;

  public SmartNvmeLunInfoBackendTrs getBackendTrsSmartNvmeLiBt() {
    return backendTrsSmartNvmeLiBt;
  }

  public void setBackendTrsSmartNvmeLiBt(SmartNvmeLunInfoBackendTrs backendTrsSmartNvmeLiBt) {
    this.backendTrsSmartNvmeLiBt = backendTrsSmartNvmeLiBt;
  }

  public SmartScsiLunInfoBackendTrs getBackendTrsSmartscsiLiBt() {
    return backendTrsSmartscsiLiBt;
  }

  public void setBackendTrsSmartscsiLiBt(SmartScsiLunInfoBackendTrs backendTrsSmartscsiLiBt) {
    this.backendTrsSmartscsiLiBt = backendTrsSmartscsiLiBt;
  }
}
