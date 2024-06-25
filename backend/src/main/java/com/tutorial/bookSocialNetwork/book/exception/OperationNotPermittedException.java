package com.tutorial.bookSocialNetwork.book.exception;

public class OperationNotPermittedException extends  RuntimeException{

    public OperationNotPermittedException(String message){
        super(message);

    }
}
