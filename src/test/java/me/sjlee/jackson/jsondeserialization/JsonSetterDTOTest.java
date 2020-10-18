package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonSetterDTOTest {
    @Test
    void test() throws JsonProcessingException {
        // given
        String json = "{\"id\":1,\"name\":\"My bean\"}";

        // when
        JsonSetterDTO jsonSetterDTO = new ObjectMapper().readerFor(JsonSetterDTO.class)
                .readValue(json);

        // then
        assertEquals(jsonSetterDTO.getId(), 1);
        assertEquals(jsonSetterDTO.getName(), "My bean");
        System.out.println(jsonSetterDTO);
    }
}