package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonGetterDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        JsonGetterDTO jsonGetterDTO = new JsonGetterDTO();
        jsonGetterDTO.name = "sjlee";
        jsonGetterDTO.by = "jsongetter";

        // when
        String json = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonGetterDTO);

        // then
        assertEquals(json.contains("sjlee"), true);
        assertEquals(json.contains("jsongetter"), true);
        System.out.println(json);
    }
}