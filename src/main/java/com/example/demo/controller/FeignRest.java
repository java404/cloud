package com.example.demo.controller;

import com.example.demo.client.PbdataClient;
import com.example.demo.client.general.TargetResponse;
import com.example.demo.client.pbdata.types.PbdataVersion;
import com.example.demo.client.pbdata.types.nodecfg.PbdataNodeInfo;
import com.example.demo.pbdata.SmartManagerService;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.okhttp.OkHttpClient;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
@RequestMapping("api/v1")
public class FeignRest {

    @Autowired
    private okhttp3.OkHttpClient okHttpClient;

    @Autowired
    private SmartManagerService smartManagerService;

//    @Autowired
//    Client client;

    @GetMapping("domain")
    @ResponseBody
    public String domainList() {
        final String url = "http://172.24.8.132:9000";
        String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
        final byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        final String authHeader = "Basic " + new String(encodedAuth);
        final Feign.Builder builder = Feign.builder();
        final FeignService target = Feign.builder()
                //.client(new OkHttpClient(okHttpClient))
                .client(new OkHttpClient(okHttpClient))
                .requestInterceptor(new RequestInterceptor() {
                    @Override
                    public void apply(RequestTemplate requestTemplate) {
                        requestTemplate.header("Authorization",authHeader);
                    }
                })
                .target(FeignService.class, url);
        final String domians = target.domians();
        return domians;
    }

  @GetMapping("version")
  @ResponseBody
  @ApiOperation("get api version")
  public PbdataVersion getVersion() {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final PbdataVersion apiVersion = pbDataClient.getApiVersion();
    return apiVersion;
  }

  @GetMapping("node")
  @ResponseBody
  @ApiOperation("get node info")
  public PbdataNodeInfo getNodeInfo() {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final PbdataNodeInfo nodeInfo = pbDataClient.getNodeInfo();
    return nodeInfo;
  }

  @ApiOperation("get node list")
  @GetMapping("node/list")
  @ResponseBody
  public PbdataNodeInfo[] getNodeList() {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final PbdataNodeInfo[] nodeList = pbDataClient.getNodeList();
    return nodeList;
  }

  @ApiOperation("add node info")
  @PostMapping("node")
  @ResponseBody
  public TargetResponse addNodeInfo(@RequestParam String nodeName, @RequestParam String groupName) {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final TargetResponse targetResponse = pbDataClient.addNodeInfo(nodeName, groupName);
    return targetResponse;
  }

  @ApiOperation("del node info")
  @DeleteMapping("node")
  @ResponseBody
  public TargetResponse delNodeInfo(@RequestParam String nodeIndex) {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final TargetResponse targetResponse = pbDataClient.delNodeInfo(nodeIndex);
    return targetResponse;
  }

  @ApiOperation("add group")
  @PostMapping("group")
  @ResponseBody
  public TargetResponse addGroup(@RequestParam String groupName) {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final TargetResponse targetResponse = pbDataClient.addGroup(groupName);
    return targetResponse;
  }

  @ApiOperation("del group")
  @DeleteMapping("group")
  @ResponseBody
  public TargetResponse delGroup(@RequestParam String groupName) {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final TargetResponse targetResponse = pbDataClient.delGroup(groupName);
    return targetResponse;
  }

  @ApiOperation("list group")
  @GetMapping("group")
  @ResponseBody
  public TargetResponse listGroup() {
    final PbdataClient pbDataClient = smartManagerService.getPbDataClient("172.24.12.218", 9000);
    final TargetResponse targetResponse = pbDataClient.listGroup();
    return targetResponse;
  }


}
