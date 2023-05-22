package com.petzzz.app.adapter.inbound.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePetRequestJson {
    @NotNull
    private String name;
    @NotNull
    private Integer age;
    private LocalDateTime birthday;
    private Double weight;
    private String color;
    private String mainImageUrl;

}
