package com.petzzz.app.core.port.outbound;

import com.petzzz.app.core.dto.PetCoreDto;

public interface PetSavePortOutbound {
    String execute(PetCoreDto petCoreDto);
}
