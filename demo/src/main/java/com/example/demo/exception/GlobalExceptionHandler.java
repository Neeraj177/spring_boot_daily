package com.example.demo.exception;

import com.example.demo.utility.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseStatus handleUserNotFoundException(UserNotFoundException userNotFoundException)
    {
        return new ResponseStatus(200,userNotFoundException.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public String notFound(Exception e)
    {
        return "Something went wrong";
    }

}
