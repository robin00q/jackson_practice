package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonCreatorDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        String json = "{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"My bean\"\n" +
                "}";

        // when
        JsonCreatorDTO jsonCreatorDTO = new ObjectMapper()
                .readerFor(JsonCreatorDTO.class)
                .readValue(json);

        // then
        assertEquals(jsonCreatorDTO.getId(), 1);
        assertEquals(jsonCreatorDTO.getName(), "My bean");
        System.out.println(jsonCreatorDTO);
    }
}