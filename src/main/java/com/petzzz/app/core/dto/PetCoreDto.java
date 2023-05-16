package com.petzzz.app.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetCoreDto {
    private UUID id;
    private String name;
    private LocalDateTime creationDate;
    private Integer age;
    private LocalDateTime birthday;
    private Double weight;
    private String color;
    private String mainImageUrl;
}
