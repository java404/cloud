package com.example.demo.controller;

import feign.Client;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.httpclient.ApacheHttpClient;
import feign.okhttp.OkHttpClient;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
@RequestMapping("api/v1")
public class FeignRest {

    @Autowired
    private okhttp3.OkHttpClient okHttpClient;

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
}
