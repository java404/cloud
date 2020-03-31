package com.example.demo.client.pbdata.types.group;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataInitGroupListItem {
  public static final String KEY_GROUP_LIST_V3_2 = "ext:pds.ios.get_initgroup_list_response";

  @JsonProperty("initgroup_infos")
  private PbdataInitGroupInfo[] pbdataInitGroupInfos;

  public PbdataInitGroupInfo[] getPbdataInitGroupInfos() {
    return pbdataInitGroupInfos;
  }

  public void setPbdataInitGroupInfos(PbdataInitGroupInfo[] pbdataInitGroupInfos) {
    this.pbdataInitGroupInfos = pbdataInitGroupInfos;
  }
}
