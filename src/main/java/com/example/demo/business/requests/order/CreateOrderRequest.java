package com.example.demo.business.requests.order;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {

	
	@NotNull
	private int employeeId;
	
	@FutureOrPresent
	private LocalDateTime date;
}
