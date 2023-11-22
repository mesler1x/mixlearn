package com.asparagus.MixLearn.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ArticleNotFoundAdvice {
    public Map<String, String> exceptionHandler(ArticleNotFoundException articleNotFoundException){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", articleNotFoundException.getMessage());
        return errorMap;
    }
}
