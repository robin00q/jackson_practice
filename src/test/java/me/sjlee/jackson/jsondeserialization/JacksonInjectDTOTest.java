package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JacksonInjectDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        String json = "{\"name\":\"My bean\"}";

        // when
        InjectableValues inject = new InjectableValues.Std()
                .addValue(Integer.class, 1);
        JacksonInjectDTO jacksonInjectDTO = new ObjectMapper().reader(inject)
                .forType(JacksonInjectDTO.class)
                .readValue(json);

        // then
        assertEquals(jacksonInjectDTO.getId(), 1);
        assertEquals(jacksonInjectDTO.getName(), "My bean");
        System.out.println(jacksonInjectDTO);
    }

}