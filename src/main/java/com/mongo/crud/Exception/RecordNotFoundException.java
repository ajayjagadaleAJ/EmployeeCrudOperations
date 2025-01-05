package com.mongo.crud.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND)
public class RecordNotFoundException extends RuntimeException {

     public RecordNotFoundException(String msg){
     super(msg);
    }

}
