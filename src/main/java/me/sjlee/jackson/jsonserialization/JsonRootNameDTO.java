package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Builder;
import lombok.Getter;

@Builder
@JsonRootName(value = "user")
@Getter
public class JsonRootNameDTO {
    String name;
    Integer age;
}
