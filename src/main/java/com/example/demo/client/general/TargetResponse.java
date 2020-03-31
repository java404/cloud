package com.example.demo.client.general;

import com.example.demo.client.exception.ClientParseException;
import com.example.demo.client.exception.ReturnCodeException;
import com.example.demo.util.ObjectMapperFactory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;

public class TargetResponse {
    private JsonNode body;
    private ReturnCode returnCode;

    @JsonProperty("rc")
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    @JsonProperty("rc")
    public void setReturnCode(ReturnCode returnCode) {
        this.returnCode = returnCode;
    }

    public JsonNode getBody() {
        return body;
    }

    public void setBody(JsonNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "TargetResponse{" + "returnCode=" + returnCode + '}';
    }

    /** Make response. */
    public <T> T makeResponse(String name, Class<T>  valueType)
            throws ReturnCodeException, ClientParseException {
        if (returnCode.getReturnCode() != 0) {
            throw new ReturnCodeException(returnCode);
        }
        if (body == null) {
            return null;
        }
        final ObjectMapper mapper = ObjectMapperFactory.make();
        try {
            final JsonNode value = body.get(Strings.nullToEmpty(name));
            if (value == null) {
                return null;
            } else {
                return mapper.treeToValue(value, valueType);
            }
        } catch (JsonProcessingException err) {
            throw new ClientParseException(err);
        }
    }
}
