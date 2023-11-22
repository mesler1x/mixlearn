package com.asparagus.MixLearn.exception;

public class MessageNotFoundException extends RuntimeException{
    public MessageNotFoundException(Long id){
        super("could not found message with id" + id);
    }
}
