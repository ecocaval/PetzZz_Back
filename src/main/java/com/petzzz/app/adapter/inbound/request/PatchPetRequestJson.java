package com.petzzz.app.adapter.inbound.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatchPetRequestJson {
    private String name;
    private String age;
    private String birthday;
    private String weight;
    private String color;
    private String mainImageUrl;
}
