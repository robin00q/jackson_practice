package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class JsonSetterDTO {
    private Integer id;
    private String name;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
}
