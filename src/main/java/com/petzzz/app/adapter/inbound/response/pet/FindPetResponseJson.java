package com.petzzz.app.adapter.inbound.response.pet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class FindPetResponseJson {
    private UUID petUuid;
    private String petName;
}
