package com.example.demo.client;

import com.example.demo.client.general.TargetHost;
import com.example.demo.client.general.TargetResponse;
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
    private static PbdataVersion apiVersion;

    public PbdataClient(String address, int port) {
        this(new TargetHost(address, port));
    }

    public PbdataClient(TargetHost targetHost) {
        this(Feign.builder(), targetHost);
    }

    public PbdataClient(Feign.Builder feign, TargetHost targetHost) {
        this.pbdataApi = new PbdataApi(feign, targetHost);
        apiVersion = new PbdataVersion();
        apiVersion.setVersion(DEFAULT_API_VER);
    }

    /** Init client. */
    public void initClient() {
        apiVersion = pbdataApi.getVersion();
        logger.info("init pbdata client with version {}", apiVersion);
    }

    public PbdataVersion getApiVersion() {
        if(apiVersion.isEmpty()) {
            initClient();
        }
        return apiVersion;
    }

    public PbdataNodeInfo[] getNodeList() {
        return pbdataApi.getNodeList(apiVersion);
    }

    public TargetResponse addNodeInfo(String groupName, String nodeName) {
        return pbdataApi.addNodeInfo(apiVersion, nodeName, groupName);
    }

    public TargetResponse delNodeInfo(String nodeIndex) {
        return pbdataApi.delNodeInfo(apiVersion, nodeIndex);
    }

    public PbdataNodeInfo getNodeInfo() {
        return pbdataApi.getNodeInfo(apiVersion);
    }

    public TargetResponse addGroup(String groupName) {
        return pbdataApi.addGroup(apiVersion, groupName);
    }

    public TargetResponse delGroup(String groupName) {
        return pbdataApi.delGroup(apiVersion, groupName);
    }

    public TargetResponse listGroup() {
        return pbdataApi.listGroup(apiVersion);
    }

}
