package me.sjlee.jackson.jsondeserialization;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class JsonAliasDTO {
    @JsonAlias({"f_name", "fName"})
    private String firstName;
    private String lastName;
}
