package com.petzzz.app.adapter.inbound.service;

import com.petzzz.app.adapter.inbound.port.PetInboundPort;
import com.petzzz.app.adapter.outbound.pet.port.PetCreatePortOutbound;
import com.petzzz.app.core.dto.PetCoreDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PetService implements PetInboundPort {

    private PetCreatePortOutbound petCreatePortOutbound;

    @Override
    public String create(PetCoreDto petCoreDto) {
        var petUuid = petCreatePortOutbound.execute(petCoreDto);
        return petUuid;
    }

}
