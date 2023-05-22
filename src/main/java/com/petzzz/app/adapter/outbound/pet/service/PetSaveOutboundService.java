package com.petzzz.app.adapter.outbound.pet.service;

import com.petzzz.app.adapter.outbound.pet.mapper.PetOutboundMapper;
import com.petzzz.app.adapter.outbound.pet.model.PetModel;
import com.petzzz.app.adapter.outbound.pet.repository.PetRepository;
import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.port.outbound.PetSavePortOutbound;

public class PetSaveOutboundService implements PetSavePortOutbound {
    private PetRepository petRepository;
    private PetOutboundMapper petOutboundMapper;
    @Override
    public String execute(PetCoreDto petCoreDto) {
        PetModel petModelToCreate = petOutboundMapper.from(petCoreDto);
        PetModel savedPetModel = petRepository.save(petModelToCreate);
        return savedPetModel.getId().toString();
    }
}
