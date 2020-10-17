package me.sjlee.jackson.jsonserialization;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;


@JsonPropertyOrder({"grade", "habit", "name"})
public class JsonPropertyOrderDTO {
    String name;
    Long grade;
    String habit;
}
