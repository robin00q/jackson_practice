package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonAnySetterDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        String json = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";

        // when
        JsonAnySetterDTO jsonAnySetterDTO = new ObjectMapper().readerFor(JsonAnySetterDTO.class)
                .readValue(json);

        // then
        assertEquals(jsonAnySetterDTO.getProperties().get("attr1"), "val1");
        assertEquals(jsonAnySetterDTO.getProperties().get("attr2"), "val2");
        System.out.println(jsonAnySetterDTO);
    }
}