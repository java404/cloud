package com.example.demo.client.pbdata.service;

import com.example.demo.client.pbdata.model.ActionResult;

public interface PbdataStorageApiService {

    /**
     * 获取版本号 GET : http://<ip:port>/api/version
     */
    public ActionResult<Object> getVersion(String service_ip);
}
