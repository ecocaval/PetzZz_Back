package com.petzzz.app.adapter.outbound.pet.service;

import com.petzzz.app.adapter.outbound.pet.mapper.PetOutboundMapper;
import com.petzzz.app.adapter.outbound.pet.repository.PetRepository;
import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.port.outbound.PetFindAllPortOutbound;
import org.springframework.data.domain.Pageable;

public class PetFindAllOutboundService implements PetFindAllPortOutbound {
    private PetRepository petRepository;
    private PetOutboundMapper petOutboundMapper;
    @Override
    public PetCoreDto[] execute(Pageable pageable) {
        return petOutboundMapper.from(petRepository.findAll(pageable));
    }
}
