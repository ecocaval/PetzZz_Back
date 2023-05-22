package com.petzzz.app.adapter.inbound.service;

import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.error.exceptions.PetException;
import com.petzzz.app.core.port.inbound.PetInboundPort;
import com.petzzz.app.core.port.outbound.PetFindAllPortOutbound;
import com.petzzz.app.core.port.outbound.PetFindUniquePortOutbound;
import com.petzzz.app.core.port.outbound.PetSavePortOutbound;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PetService implements PetInboundPort {

    private PetSavePortOutbound petSavePortOutbound;
    private PetFindAllPortOutbound petFindAllPortOutbound;
    private PetFindUniquePortOutbound petFindUniquePortOutbound;

    @Override
    public PetCoreDto[] findAll(Pageable pageable) throws PetException {
        PetCoreDto[] pets = petFindAllPortOutbound.execute(pageable);
        if(pets[0] == null) {
            throw PetException.noPetsFound();
        }
        return pets;
    }

    @Override
    public PetCoreDto findById(UUID petUuid) throws PetException {
        PetCoreDto pet = petFindUniquePortOutbound.execute(petUuid);
        if(pet == null) {
            throw PetException.noPetFound();
        }
        return pet;
    }

    @Override
    public String save(PetCoreDto petCoreDto) {
        String petUuid = petSavePortOutbound.execute(petCoreDto);
        return petUuid;
    }
}
