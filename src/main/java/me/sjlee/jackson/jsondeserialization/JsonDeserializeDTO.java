package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.ToString;
import me.sjlee.jackson.jsondeserialization.serializer.CustomJsonDeserializer;

import java.time.LocalDateTime;

@Getter
@ToString
public class JsonDeserializeDTO {

    private String name;

    @JsonDeserialize(using = CustomJsonDeserializer.class)
    private LocalDateTime eventDate;
}
