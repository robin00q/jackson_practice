package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
public class JsonValueDTO {

    private Integer id;
    private String name;

    private Integer age;

    @JsonValue
    public String returnJsonValue() {
        return id + " 이름은 : " + name + " 나이는 : " + age;
    }
}
