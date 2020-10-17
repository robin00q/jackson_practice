package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonRawValueDTOTest {

@Test
void test() throws JsonProcessingException {
    // given
    JsonRawValueDTO jsonRawValueDTO = JsonRawValueDTO.builder()
            .name("sjlee")
            .age(27L)
            .rawValue("{\"attr\":raw value}")
            .build();

    // when
    String json = new ObjectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(jsonRawValueDTO);

    // then
    assertEquals(json.contains("sjlee"), true);
    assertEquals(json.contains("27"), true);
    assertEquals(json.contains("{\"attr\":raw value}"), true);
    System.out.println(json);
}

}