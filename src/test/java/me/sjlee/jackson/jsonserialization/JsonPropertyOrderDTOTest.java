package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonPropertyOrderDTOTest {
    @Test
    void test() throws JsonProcessingException {
        JsonPropertyOrderDTO build = JsonPropertyOrderDTO.builder()
                .grade(1L)
                .habit("soccer")
                .name("sjlee")
                .build();

        String json = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(build);

        System.out.println(json);
    }

}