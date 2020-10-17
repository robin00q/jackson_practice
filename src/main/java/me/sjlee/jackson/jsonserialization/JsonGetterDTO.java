package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterDTO {
    String name;
    String by;

    @JsonGetter
    public String getName() {
        return name;
    }

    @JsonGetter
    public String getBy() {
        return by;
    }
}
