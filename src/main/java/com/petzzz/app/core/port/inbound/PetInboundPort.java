package com.petzzz.app.core.port.inbound;

import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.error.exceptions.PetException;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface PetInboundPort {
    public PetCoreDto[] findAll(Pageable pageable) throws PetException;
    public PetCoreDto findById(UUID petUuid) throws PetException;
    public String save(PetCoreDto petCoreDto);
}
