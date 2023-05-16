package com.petzzz.app.adapter.inbound.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePetRequestJson {
    @NotNull
    private String name;
    @NotNull
    private String age;
    private String birthday;
    @NotNull
    private String weight;
    @NotNull
    private String color;
    @NotNull
    private String mainImageUrl;
}
