package com.petzzz.app.adapter.inbound.mapper;

import com.petzzz.app.adapter.inbound.request.CreatePetRequestJson;
import com.petzzz.app.adapter.inbound.request.PatchPetRequestJson;
import com.petzzz.app.adapter.inbound.request.UpdatePetRequestJson;
import com.petzzz.app.core.dto.PetCoreDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetInboundMapper {
    PetCoreDto from(CreatePetRequestJson adapterDto);
    PetCoreDto from(PatchPetRequestJson adapterDto);
    PetCoreDto from(UpdatePetRequestJson adapterDto);

}
