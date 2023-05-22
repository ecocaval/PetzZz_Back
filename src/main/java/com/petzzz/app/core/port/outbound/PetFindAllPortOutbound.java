package com.petzzz.app.core.port.outbound;

import com.petzzz.app.core.dto.PetCoreDto;
import org.springframework.data.domain.Pageable;

public interface PetFindAllPortOutbound {
    PetCoreDto[] execute(Pageable pageable);
}
