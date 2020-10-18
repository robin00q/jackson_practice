package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
public class JsonAnySetterDTO {
    private String name;

    private Map<String, String> properties = new HashMap<>();

    @JsonAnySetter
    public void addProperties(String key, String value) {
        properties.put(key, value);
    }
}
