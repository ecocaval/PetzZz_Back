package com.petzzz.app.core.port.outbound;

import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.error.exceptions.PetException;

import java.util.UUID;

public interface PetFindUniquePortOutbound {
    PetCoreDto execute(UUID petUuid) throws PetException;
}
