package com.petzzz.app.adapter.outbound.pet.port;

import com.petzzz.app.core.dto.PetCoreDto;

public interface PetCreatePortOutbound {
    public String execute(PetCoreDto petCoreDto);
}
