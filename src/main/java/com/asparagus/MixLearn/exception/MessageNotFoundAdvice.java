package com.asparagus.MixLearn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MessageNotFoundAdvice{
    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(MessageNotFoundException messageNotFoundException){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", messageNotFoundException.getMessage());
        return errorMap;
    }
}
