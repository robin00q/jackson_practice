package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonRootNameDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        JsonRootNameDTO jsonRootNameDTO = JsonRootNameDTO.builder()
                .name("sjlee")
                .age(27)
                .build();

        // when
        String json = new ObjectMapper()
                .enable(SerializationFeature.WRAP_ROOT_VALUE)
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonRootNameDTO);

        // then
        assertEquals(json.contains("user"), true);
        System.out.println(json);
    }

}