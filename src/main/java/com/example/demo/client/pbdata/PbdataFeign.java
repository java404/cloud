package com.example.demo.client.pbdata;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.client.general.TargetResponse;
import com.example.demo.client.pbdata.types.PbdataVersion;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface PbdataFeign {

    /**
     * 获取API版本  GET : http://<ip:port>/api/version.
     * */
    @RequestLine("GET /api/version")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    PbdataVersion getVersion();

    /**
     * 获取节点列表 GET : http://<ip:port>/api/<version>/instances/node/list.
     * */
    @RequestLine("GET /api/{version}/instance/node/list")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    TargetResponse getNodeList(@Param("version") String version);

    /**
     * 添加节点 POST: http://<ip:port>/api/<version>/instances/node.
     * */
    @RequestLine("POST /api/{version}/instances/node")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    TargetResponse addNode(@Param("version") String version, @RequestBody JSONObject jsonObject);

    /**
     * 删除节点 DELETE: http://<ip:port>/api/<version>/instances/node
     * */
    @RequestLine("DELETE /api/{version}/instances/node")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    TargetResponse delNode(@Param("version") String version, @RequestBody JSONObject jsonObject);

    /**
     *  获取节点信息 GET : http://<ip:port>/api/<version>/instances/node.
     **/
    @RequestLine("GET /api/{version}/instances/node")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    TargetResponse getNodeInfo(@Param("version") String version);

    /**
     * 节点配置 PATCH : http://<ip:port>/api/<version>/instances/node
     */
    @RequestLine("PATCH /api/{version}/instance/node")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    TargetResponse configNodeInfo(@Param("version") String version);

    /**
     * 添加组 POST: http://<ip:port>/api/<version>/instances/group
     */
    @RequestLine("POST /api/{version}/instances/group")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    TargetResponse addGroup(@Param("version") String version, @RequestBody JSONObject jsonObject);

    /**
     * 删除组 DELETE: http://<ip:port>/api/<version>/instances/group
     */
    @RequestLine("DELETE /api/{version}/instances/group")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    TargetResponse delGroup(@Param("version") String version, @RequestBody JSONObject jsonObject);

    /**
     * 获取节点组列表 GET : http://<ip:port>/api/<version>/instances/group
     */
    @RequestLine("GET api/{version}/instances/group")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    TargetResponse groupList(@Param("version") String version);
}
