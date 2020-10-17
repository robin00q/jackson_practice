package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Builder;

@Builder
public class JsonRawValueDTO {
    String name;
    Long age;

    @JsonRawValue
    String rawValue;

    @JsonGetter
    public String getName() {
        return name;
    }

    @JsonGetter
    public Long getAge() {
        return age;
    }
}
