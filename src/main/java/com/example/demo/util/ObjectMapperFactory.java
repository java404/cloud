package com.example.demo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import org.apache.commons.collections4.ListUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectMapperFactory {
    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /** Make object mapper with the configuration. */
    public static ObjectMapper make() {
        return mapper;
    }

    public static JsonNode readTree(String value) throws IOException {
        final ObjectMapper objectMapper = make();
        return mapper.readTree(value);
    }

    public static String writeValueAsString(Object value) throws JsonProcessingException {
        final ObjectMapper objectMapper = make();
        return objectMapper.writeValueAsString(value);
    }

    /** Write Value As String (no exception).  */
    public static String writeValueAsStringQuietly(Object value) {
        try {
            return writeValueAsString(value);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

    public static JsonNode writeValue(Object value) {
        final ObjectMapper objectMapper = make();
        return objectMapper.valueToTree(value);
    }

    public static <T> T treeToValue(JsonNode node, Class<T> valueType)
            throws JsonProcessingException {
        final ObjectMapper objectMapper = make();
        return objectMapper.treeToValue(node, valueType);
    }

    public static <T> T readValue(String data, Class<T> valueType) throws IOException {
        final ObjectMapper objectMapper = make();
        return Strings.isNullOrEmpty(data) ? null : objectMapper.readValue(data, valueType);
    }

    public static <T> T readValue(String data, TypeReference<T> typeReference) throws IOException {
        final ObjectMapper objectMapper = make();
        return Strings.isNullOrEmpty(data) ? null : objectMapper.readValue(data, typeReference);
    }

    /** Write a list object to list json nodes. */
    public static <T> List<JsonNode> writeValueList(List<T> items) {
        final ObjectMapper objectMapper = make();
        final List<JsonNode> nodes = new ArrayList<>();
        for (final T item : items) {
            nodes.add(objectMapper.valueToTree(item));
        }
        return nodes;
    }

    /** Append property without exception. */
    public static String appendPropQuietly(String src, String key, Object val) {
        try {
            return appendProp(src, key, val);
        } catch (Exception ignore) {
            return src;
        }
    }

    /** Append property (String result). */
    public static String appendProp(String src, String key, Object val) throws IOException {
        return writeValueAsString(appendProp(readTree(src), key, val));
    }

    /** Append property. */
    public static JsonNode appendProp(JsonNode src, String key, Object val) {
        ((ObjectNode)src).putPOJO(key, val);
        return src;
    }

    /** Find json node via key path (no exception). */
    public static JsonNode findValueQuietly(JsonNode rootNode, String keyPath) {
        try {
            return findValue(rootNode, keyPath);
        } catch (Exception ignore) {
            return null;
        }
    }

    /** Find json node via key path.
     *  Example: { "a": { "b" : 1 } } =>  "a.b" = 1.
     */
    private static JsonNode findValue(JsonNode rootNode, String keyPath) {
        if (Strings.isNullOrEmpty(keyPath)) {
            return null;
        }
        final List<String> keys = ListUtils.emptyIfNull(Splitter.on(".")
                .trimResults().splitToList(keyPath));
        JsonNode node = rootNode;
        for (final String key : keys) {
            if (Strings.isNullOrEmpty(key)) {
                return null;
            }
            node = node.get(key);
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    /** Parse JSON String list. */
    public static List<String> parseStrListQuite(String list) {
        try {
            return parseStrList(list);
        } catch (Exception ignore) {
            return null;
        }
    }

    private static List<String> parseStrList(String source) throws IOException {
        final JsonNode list = readTree(source);
        if (list == null || !list.isArray()) {
            return null;
        }
        final List<String> values = new ArrayList<>();
        for (int i = 0; i < list.size(); ++i) {
            final JsonNode item = list.get(i);
            values.add(item == null ? "" : item.asText());
        }
        return values;
    }
}
