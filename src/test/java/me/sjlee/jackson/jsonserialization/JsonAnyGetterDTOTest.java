package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class JsonAnyGetterDTOTest {

    @Test
    void test() throws JsonProcessingException {
        // given
        JsonAnyGetterDTO jsonAnyGetterDTO = new JsonAnyGetterDTO();
        jsonAnyGetterDTO.getProperties().put("blog", "tistory");
        jsonAnyGetterDTO.getProperties().put("name", "sukjunelee");

        // when
        String json = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonAnyGetterDTO);

        // then
        assertEquals(json.contains("tistory"), true);
        assertEquals(json.contains("sukjunelee"), true);
        System.out.println(json);
    }

}