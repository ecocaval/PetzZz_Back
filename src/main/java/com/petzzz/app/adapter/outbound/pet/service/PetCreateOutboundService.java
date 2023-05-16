package com.petzzz.app.adapter.outbound.pet.service;

import com.petzzz.app.adapter.outbound.pet.mapper.PetOutboundMapper;
import com.petzzz.app.adapter.outbound.pet.port.PetCreatePortOutbound;
import com.petzzz.app.adapter.outbound.pet.repository.PetRepository;
import com.petzzz.app.core.dto.PetCoreDto;

public class PetCreateOutboundService implements PetCreatePortOutbound {

    private PetRepository petRepository;

    private PetOutboundMapper petOutboundMapper;

    @Override
    public String execute(PetCoreDto petCoreDto) {
        var petModelToCreate = petOutboundMapper.from(petCoreDto);

        var savedPetModel = petRepository.save(petModelToCreate);

        return savedPetModel.getId().toString();
    }
}
