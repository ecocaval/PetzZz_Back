package com.petzzz.app.adapter.outbound.pet.mapper;

import com.petzzz.app.adapter.outbound.pet.model.PetModel;
import com.petzzz.app.core.dto.PetCoreDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetOutboundMapper {

    PetModel from(PetCoreDto petCoreDto);
    PetCoreDto from(PetModel petModel);
}
