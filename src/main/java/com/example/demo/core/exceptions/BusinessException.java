package com.example.demo.core.exceptions;

public class BusinessException extends RuntimeException{

	public BusinessException(String name) {
        super(name);
    }
}
