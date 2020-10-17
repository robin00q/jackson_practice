package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class JsonAnyGetterDTO {
    private Map<String, String> properties = new HashMap<>();

    @JsonAnyGetter(enabled = false)
    public Map<String, String> getProperties() {
        return properties;
    }
}
