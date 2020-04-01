package com.example.demo.client.pbdata;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.client.exception.ClientParseException;
import com.example.demo.client.exception.ReturnCodeException;
import com.example.demo.client.general.ClientApi;
import com.example.demo.client.general.TargetHost;
import com.example.demo.client.general.TargetResponse;
import com.example.demo.client.pbdata.types.PbdataVersion;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfo;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfoItem;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeListItem;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class PbdataApi extends ClientApi {

    public PbdataApi(Feign.Builder feign, TargetHost targetHost) {
        super(feign, targetHost);
    }

    /**
     * Get pbdata version.
     */
    public PbdataVersion getVersion() {
        return feign.encoder(new JacksonEncoder())
                    .decoder(new JacksonDecoder())
                    .target(PbdataFeign.class, hostUrlPrefix)
                    .getVersion();
    }

    /**
     * Get Node list.
     */
    public PbdataNodeInfo[] getNodeList(PbdataVersion apiVersion) {
        final PbdataNodeListItem item = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .getNodeList(apiVersion.getVersion())
                .makeResponse(PbdataNodeListItem.getKeyNodeList(apiVersion), PbdataNodeListItem.class);
        return item == null ? null : item.getNodeInfos(apiVersion);
    }

    /**
     * add node info
     */
    public TargetResponse addNodeInfo(PbdataVersion apiVersion, String nodeName, String groupName) {
        JSONObject params = new JSONObject();
        params.put("node_name", nodeName);
        params.put("group_name", groupName);
        final TargetResponse targetResponse = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .addNode(apiVersion.getVersion(), params);
        return targetResponse;
    }

    /**
     * del node info
     */
    public TargetResponse delNodeInfo(PbdataVersion apiVersion, String nodeIndex) {
        JSONObject params = new JSONObject();
        params.put("node_index", nodeIndex);
        final TargetResponse targetResponse = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .delNode(apiVersion.getVersion(), params);
        return targetResponse;
    }

    /**
     * Get Node Info.
     */
    public PbdataNodeInfo getNodeInfo(PbdataVersion apiVersion) throws ClientParseException, ReturnCodeException {
        final PbdataNodeInfoItem item = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .getNodeInfo(apiVersion.getVersion()).makeResponse(PbdataNodeInfoItem.KEY_NODE_INFO, PbdataNodeInfoItem.class);
        return item == null ? null : item.getNodeInfo();
    }

    /**
     * Add Group
     */
    public TargetResponse addGroup(PbdataVersion apiVersion,String groupName) {
        JSONObject params = new JSONObject();
        params.put("group_name", groupName);
        final TargetResponse targetResponse = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .addGroup(apiVersion.getVersion(), params);
        return targetResponse;
    }

    /**
     * Del Group
     */
    public TargetResponse delGroup(PbdataVersion apiVersion, String groupName) {
        JSONObject params = new JSONObject();
        params.put("group_name", groupName);
        final TargetResponse targetResponse = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .delGroup(apiVersion.getVersion(), params);
        return targetResponse;
    }

    /**
     * List Group
     */
    public TargetResponse listGroup(PbdataVersion apiVersion) {
        final TargetResponse targetResponse = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .groupList(apiVersion.getVersion());
        return targetResponse;
    }


}
