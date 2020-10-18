package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class JsonCreatorDTO {
    private Integer id;

    private String name;

    @JsonCreator
    public JsonCreatorDTO(@JsonProperty("id") Integer id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
}
