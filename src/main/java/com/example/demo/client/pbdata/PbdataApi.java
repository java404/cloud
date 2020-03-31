package com.example.demo.client.pbdata;

import com.example.demo.client.exception.ClientParseException;
import com.example.demo.client.exception.ReturnCodeException;
import com.example.demo.client.general.ClientApi;
import com.example.demo.client.general.TargetHost;
import com.example.demo.client.pbdata.types.PbdataVersion;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfo;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfoItem;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class PbdataApi extends ClientApi {

    private String urlPrefix = "v3.0";

    public PbdataApi(Feign.Builder feign, TargetHost targetHost) {
        super(feign, targetHost);
    }

    public String getUrlPrefix() {
        return urlPrefix;
    }

    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix;
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
     * Get Node Info.
     */
    public PbdataNodeInfo getNodeInfo() throws ClientParseException, ReturnCodeException {
        final PbdataNodeInfoItem item = feign.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(PbdataFeign.class, hostUrlPrefix)
                .getNodeInfo().makeResponse(PbdataNodeInfoItem.KEY_NODE_INFO, PbdataNodeInfoItem.class);
        return item == null ? null : item.getNodeInfo();
    }


}
