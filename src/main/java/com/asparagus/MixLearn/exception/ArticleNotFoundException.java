package com.asparagus.MixLearn.exception;

public class ArticleNotFoundException extends RuntimeException{
    public ArticleNotFoundException(Long id){
        super("could not found article with id" + id);
    }
}
