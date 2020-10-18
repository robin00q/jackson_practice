package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class JacksonInjectDTO {

    @JacksonInject
    private Integer id;

    private String name;

}
