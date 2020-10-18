package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonAliasDTOTest {
    @Test
    void test() throws JsonProcessingException {
        // given
        String json = "{\"f_name\": \"John\", \"lastName\": \"Green\"}";
        // String json = "{\"fName\": \"John\", \"lastName\": \"Green\"}";

        System.out.println(json);

        // when
        JsonAliasDTO jsonAliasDTO = new ObjectMapper().readerFor(JsonAliasDTO.class)
                .readValue(json);

        // then
        assertEquals(jsonAliasDTO.getFirstName(), "John");
        assertEquals(jsonAliasDTO.getLastName(), "Green");
        System.out.println(jsonAliasDTO);
    }
}