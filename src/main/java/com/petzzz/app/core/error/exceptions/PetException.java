package com.petzzz.app.core.error.exceptions;

import com.petzzz.app.core.error.messages.PetErrorMessages;
import org.springframework.http.HttpStatus;

public class PetException extends BaseException{

    private PetException(String message, Integer exceptionStatusCode) {
        super(message, exceptionStatusCode);
    }

    public static PetException noPetsFound() {
        Integer exceptionStatusValue = HttpStatus.NOT_FOUND.value();
        return new PetException(PetErrorMessages.PETS_REGISTERS_NOT_FOUND, exceptionStatusValue);
    }

    public static PetException noPetFound() {
        Integer exceptionStatusValue = HttpStatus.NOT_FOUND.value();
        return new PetException(PetErrorMessages.PET_REGISTER_NOT_FOUND, exceptionStatusValue);
    }
}
