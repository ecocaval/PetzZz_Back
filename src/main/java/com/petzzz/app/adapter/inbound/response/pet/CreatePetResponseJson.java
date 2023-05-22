package com.petzzz.app.adapter.inbound.response.pet;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CreatePetResponseJson {
    private String message;
    private UUID petUuid;
}
