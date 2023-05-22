package com.petzzz.app.adapter.outbound.pet.service;

import com.petzzz.app.adapter.outbound.pet.mapper.PetOutboundMapper;
import com.petzzz.app.adapter.outbound.pet.repository.PetRepository;
import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.port.outbound.PetFindUniquePortOutbound;

import java.util.UUID;

public class PetFindByIdOutboundService implements PetFindUniquePortOutbound {
    private PetRepository petRepository;
    private PetOutboundMapper petOutboundMapper;
    @Override
    public PetCoreDto execute(UUID petUuid) {
        var pet = petRepository.findById(petUuid);
        return petOutboundMapper.from(pet);
    }
}
