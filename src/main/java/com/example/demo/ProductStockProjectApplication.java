package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.core.result.ErrorDataResult;


@SpringBootApplication
@RestControllerAdvice
public class ProductStockProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductStockProjectApplication.class, args);
	}
	 @Bean
	 public ModelMapper modelMapper() {
	       return new ModelMapper();
	 }

	 @ExceptionHandler
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ErrorDataResult<Object> handleValidationExceptions(MethodArgumentNotValidException methodArgumentNotValidException) {
	        Map<String, String> validationErrors = new HashMap<String, String>();
	        for (FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()) {
	            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());

	        }

	        ErrorDataResult<Object> errorDataResult = new ErrorDataResult<Object>(validationErrors, "VALIDATION.EXCEPTIONS");
	        return errorDataResult;

	    }

	    @ExceptionHandler
	    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
	    public ErrorDataResult<Object> handleBusinessExceptions(Exception e) {
	        ErrorDataResult<Object> errorDataResult = new ErrorDataResult<Object>(e.getMessage(), "BUSINESS.EXCEPTION");
	        return errorDataResult;
	    }
	
}
