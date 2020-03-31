package com.example.demo.client;

import com.example.demo.client.general.TargetHost;
import com.example.demo.client.pbdata.PbdataApi;
import com.example.demo.client.pbdata.types.PbdataVersion;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfo;
import feign.Feign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PbdataClient {
    private static final Logger logger = LoggerFactory.getLogger(PbdataClient.class);
    private static final String DEFAULT_API_VER = "v3.0";
    private final PbdataApi pbdataApi;
    private PbdataVersion apiVersion;

    public PbdataClient(String address, int port) {
        this(new TargetHost(address, port));
    }

    public PbdataClient(TargetHost targetHost) {
        this(Feign.builder(), targetHost);
    }

    public PbdataClient(Feign.Builder feign, TargetHost targetHost) {
        this.pbdataApi = new PbdataApi(feign, targetHost);
        this.apiVersion = new PbdataVersion();
        this.apiVersion.setVersion(DEFAULT_API_VER);
    }

    /** Init client. */
    public void initClient() {
        this.apiVersion = pbdataApi.getVersion();
        this.pbdataApi.setUrlPrefix(String.format("api/%s", this.apiVersion.getVersion()));
        logger.info("init pbdata client with version {}", this.apiVersion);
    }

    public PbdataVersion getApiVersion() {
        if(apiVersion.isEmpty()) {
            initClient();
        }
        return apiVersion;
    }

    public PbdataNodeInfo getNodeInfo() {
        return pbdataApi.getNodeInfo();
    }
}
