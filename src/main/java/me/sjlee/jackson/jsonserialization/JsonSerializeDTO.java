package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import me.sjlee.jackson.jsonserialization.serializer.CustomJsonSerializer;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Getter
public class JsonSerializeDTO {
    private String name;

    @JsonSerialize(using = CustomJsonSerializer.class)
    private LocalDateTime localDateTime;
}
