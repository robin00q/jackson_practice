package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.sjlee.jackson.jsondeserialization.serializer.CustomJsonDeserializer;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class JsonDeserializeDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        String json
                = "{\"name\":\"party\",\"eventDate\":\"2020-10-18 11:11:11\"}";

        // when
        JsonDeserializeDTO jsonDeserializeDTO = new ObjectMapper().readerFor(JsonDeserializeDTO.class)
                .readValue(json);

        // then
        assertEquals(jsonDeserializeDTO.getName(), "party");
        assertEquals(jsonDeserializeDTO.getEventDate(), LocalDateTime.parse("2020-10-18 11:11:11", CustomJsonDeserializer.formatter));
        System.out.println(jsonDeserializeDTO);
    }

}