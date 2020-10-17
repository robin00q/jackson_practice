package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonValueDTOTest {

    @Test
    void test() throws JsonProcessingException {
        JsonValueDTO jsonValueDTO = JsonValueDTO.builder()
                .id(1)
                .name("sjlee")
                .age(27)
                .build();

        String content = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonValueDTO);

        System.out.println(content);
    }


}