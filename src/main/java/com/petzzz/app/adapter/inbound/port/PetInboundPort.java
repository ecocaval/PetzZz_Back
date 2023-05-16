package com.petzzz.app.adapter.inbound.port;

import com.petzzz.app.core.dto.PetCoreDto;

public interface PetInboundPort {

    public String create(PetCoreDto petCoreDto);
}
