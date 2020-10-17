package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class JsonSerializeDTOTest {

    @Test
    void test() throws JsonProcessingException {
        JsonSerializeDTO jsonSerializeDTO = JsonSerializeDTO.builder()
                .name("sjlee")
                .localDateTime(LocalDateTime.now())
                .build();

        String json = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonSerializeDTO);

        System.out.println(json);
    }

}