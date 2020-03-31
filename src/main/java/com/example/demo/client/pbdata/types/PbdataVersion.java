package com.example.demo.client.pbdata.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.math.BigInteger;

public class PbdataVersion {

    private String version;
    @JsonProperty("sub-version")
    private BigInteger subVersion;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BigInteger getSubVersion() {
        return subVersion;
    }

    public void setSubVersion(BigInteger subVersion) {
        this.subVersion = subVersion;
    }

    public boolean isEmpty() {
        return StringUtils.isEmpty(version);
    }

    @Override
    public String toString() {
        return "PbdataVersoin{"
                + "version='" + version + '\''
                + ", subVersion=" + subVersion
                + '}';
    }
}
