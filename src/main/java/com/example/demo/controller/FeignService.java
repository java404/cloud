package com.example.demo.controller;

import feign.Headers;
import feign.RequestLine;

public interface FeignService {

    @RequestLine("GET /api/v3/instances/domains")
    @Headers("Content-Type: application/json")
    String domians();
}
