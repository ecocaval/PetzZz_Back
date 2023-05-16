package com.petzzz.app.adapter.inbound.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class GetPetResponseJson {
    private String name;
    private Integer age;
    private LocalDateTime birthday;
    private Double weight;
    private String color;
}
