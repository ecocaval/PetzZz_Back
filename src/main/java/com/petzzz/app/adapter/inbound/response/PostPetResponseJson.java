package com.petzzz.app.adapter.inbound.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.net.URI;
import java.util.UUID;

@Data
@AllArgsConstructor
public class PostPetResponseJson {
    private String message;
    private UUID petUuid;
    private URI petUri;
}
