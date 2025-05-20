package com.example.demo.exception;

import com.example.demo.utility.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseStatus handleUserNotFoundException(UserNotFoundException userNotFoundException)
    {
        return new ResponseStatus(200,userNotFoundException.getMessage());
    }
    @ExceptionHandler(FileNotFoundException.class)
    public ResponseStatus handleException(FileNotFoundException exception)
    {
        return new ResponseStatus(500,exception.getMessage());
    }


}
