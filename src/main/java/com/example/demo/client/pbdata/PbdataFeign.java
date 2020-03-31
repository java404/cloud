package com.example.demo.client.pbdata;

import com.example.demo.client.general.TargetResponse;
import com.example.demo.client.pbdata.types.PbdataVersion;
import feign.Headers;
import feign.RequestLine;

public interface PbdataFeign {

    @RequestLine("GET /api/version")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    PbdataVersion getVersion();

    @RequestLine("GET /api/v3/instances/node")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    public TargetResponse getNodeInfo();

}
