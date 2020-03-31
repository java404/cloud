package com.example.demo.client.pbdata.types.pools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PbdataPoolInfoListItem {
  public static final String KEY_POOL_LIST_V3_2 = "ext:pds.ios.get_pool_list_response";

  @JsonProperty("pool_infos")
  private PoolInfo[] poolInfos;

  public PoolInfo[] getPoolInfos() {
    return poolInfos;
  }

  public void setPoolInfos(PoolInfo[] poolInfos) {
    this.poolInfos = poolInfos;
  }
}
