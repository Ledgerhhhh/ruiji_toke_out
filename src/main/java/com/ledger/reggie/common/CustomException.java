package com.ledger.reggie.common;

/**
 * @author ledger
 * @version 1.0
 **/
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
