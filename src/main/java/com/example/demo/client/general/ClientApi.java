package com.example.demo.client.general;

import com.example.demo.config.FeignOkHttpConfig;
import feign.Feign;
import feign.okhttp.OkHttpClient;


public class ClientApi {
  protected final Feign.Builder feign;
  protected final TargetHost targetHost;
  protected final String hostUrlPrefix;

  /** Client API. */
  public ClientApi(Feign.Builder feign, TargetHost targetHost) {
    this(feign, targetHost, false);
  }

  /** Client API (http/https). */
  public ClientApi(Feign.Builder feign, TargetHost targetHost, boolean isHttps) {
    this.hostUrlPrefix = targetHost.makeServerUrl(isHttps);
    this.feign = feign.client(new OkHttpClient(FeignOkHttpConfig.okHttpClient()));
    this.targetHost = targetHost;
  }
}
