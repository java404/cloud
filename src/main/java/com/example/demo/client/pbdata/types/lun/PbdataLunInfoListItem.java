package com.example.demo.client.pbdata.types.lun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataLunInfoListItem {
  public static final String KEY_LUN_LIST_V3_2 = "ext:pds.ios.get_lun_list_response";

  @JsonProperty("lun_infos")
  private LunInfo[] lunInfos;

  public LunInfo[] getLunInfos() {
    return lunInfos;
  }

  public void setLunInfos(LunInfo[] lunInfos) {
    this.lunInfos = lunInfos;
  }
}
