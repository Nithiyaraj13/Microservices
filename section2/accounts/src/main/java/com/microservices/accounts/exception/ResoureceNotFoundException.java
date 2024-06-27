package com.microservices.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoureceNotFoundException extends RuntimeException {

    public ResoureceNotFoundException(String resourceName,String fieldName,String fieldValue){
        super(String.format("%s not found with the given input data %s:'%s'",resourceName,fieldName,fieldValue));
    }
}
