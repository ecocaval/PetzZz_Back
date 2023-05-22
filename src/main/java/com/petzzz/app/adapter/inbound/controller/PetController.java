package com.petzzz.app.adapter.inbound.controller;

import com.petzzz.app.adapter.inbound.mapper.PetInboundMapper;
import com.petzzz.app.adapter.inbound.request.CreatePetRequestJson;
import com.petzzz.app.adapter.inbound.response.pet.FindPetResponseJson;
import com.petzzz.app.adapter.inbound.response.pet.CreatePetResponseJson;
import com.petzzz.app.core.dto.PetCoreDto;
import com.petzzz.app.core.error.exceptions.PetException;
import com.petzzz.app.core.port.inbound.PetInboundPort;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pet")
public class PetController {
    private PetInboundPort petInboundPort;
    private PetInboundMapper petMapper;

    @GetMapping
    public ResponseEntity<FindPetResponseJson[]> findAll(
            @PageableDefault(page = 0,
                    size = 200, sort = "id", direction = Sort.Direction.ASC) Pageable pageable
    ) throws PetException {

        PetCoreDto[] pets = petInboundPort.findAll(pageable);

        FindPetResponseJson[] responseBody = new FindPetResponseJson[]{};

        for (int i = 0; i < pets.length; i++) {
            responseBody[i] = new FindPetResponseJson(pets[i].getId(), pets[i].getName());
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @GetMapping("/{petUuid}")
    public ResponseEntity<FindPetResponseJson> findById(@PathVariable UUID petUuid) throws PetException {

        PetCoreDto pet = petInboundPort.findById(petUuid);

        FindPetResponseJson responseBody = new FindPetResponseJson(pet.getId(), pet.getName());

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @PostMapping
    public ResponseEntity<CreatePetResponseJson> save(
            @Valid @RequestBody CreatePetRequestJson requestBody
    ) {
        PetCoreDto petDto = petMapper.from(requestBody);

        String createdPetUuid = petInboundPort.save(petDto);

        CreatePetResponseJson responseBody = new CreatePetResponseJson(
                "O cadastro do " + petDto.getName() + " foi feito com sucesso!",
                UUID.fromString(createdPetUuid)
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }
}
