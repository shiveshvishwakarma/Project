package com.lcwd.electronic.store.exception;

import lombok.Builder;

@Builder
public class ResourceNotfoundException extends RuntimeException{

    public ResourceNotfoundException(){
        super("Resource not found!!");
    }

    public ResourceNotfoundException(String message){
        super(message);
    }
}
