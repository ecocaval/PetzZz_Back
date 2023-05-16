package com.petzzz.app.adapter.inbound.controller;

import com.petzzz.app.adapter.inbound.mapper.PetInboundMapper;
import com.petzzz.app.adapter.inbound.port.PetInboundPort;
import com.petzzz.app.adapter.inbound.request.CreatePetRequestJson;
import com.petzzz.app.adapter.inbound.response.PostPetResponseJson;
import com.petzzz.app.adapter.inbound.util.PetUtils;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pet")
public class PetController {
    private PetInboundPort inboundPort;
    private PetInboundMapper mapper;
    private Environment environment;
    private ServletContext servletContext;
    private final PetUtils petUtils = PetUtils.getInstance();

    @PostMapping
    public ResponseEntity<PostPetResponseJson> create(
            @Valid @RequestBody CreatePetRequestJson requestBody,
            HttpServletRequest httpServletRequest
    ) {

        var petDto = mapper.from(requestBody);

        var createdPetId = inboundPort.create(petDto);

        var currentUri = petUtils.buildApplicationUriAfterCreate(
                environment,
                servletContext.getContextPath(),
                httpServletRequest,
                createdPetId
        );

        var responseBody = new PostPetResponseJson(
                "O cadastro do " + petDto.getName() + " foi feito com sucesso!",
                UUID.fromString(createdPetId),
                currentUri
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }
}
