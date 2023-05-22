package com.petzzz.app.adapter.outbound.pet.mapper;

import com.petzzz.app.adapter.outbound.pet.model.PetModel;
import com.petzzz.app.core.dto.PetCoreDto;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface PetOutboundMapper {
    PetModel from(PetCoreDto petCoreDto);
    PetCoreDto[] from(Page<PetModel> petModelPage);
    PetCoreDto from(Optional<PetModel> petModel);
}
