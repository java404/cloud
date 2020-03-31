package com.example.demo.client.pbdata.types.nodecfg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IosNodeCfgBackendTransport {
  @JsonProperty("backend.trs.smartnvme.ign_bt")
  private SmartNvme backendTrsSmartNvmeIgnBt;
  @JsonProperty("backend.trs.smartscsi.ign_bt")
  private SmartScsi backendTrsSmartScsiIgnBt;

  public SmartNvme getBackendTrsSmartNvmeIgnBt() {
    return backendTrsSmartNvmeIgnBt;
  }

  public void setBackendTrsSmartNvmeIgnBt(SmartNvme backendTrsSmartNvmeIgnBt) {
    this.backendTrsSmartNvmeIgnBt = backendTrsSmartNvmeIgnBt;
  }

  public SmartScsi getBackendTrsSmartScsiIgnBt() {
    return backendTrsSmartScsiIgnBt;
  }

  public void setBackendTrsSmartScsiIgnBt(SmartScsi backendTrsSmartScsiIgnBt) {
    this.backendTrsSmartScsiIgnBt = backendTrsSmartScsiIgnBt;
  }
}
