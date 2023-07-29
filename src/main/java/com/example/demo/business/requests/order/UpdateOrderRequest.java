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
public class UpdateOrderRequest {

	
	@NotNull
	private int id;
	
	@FutureOrPresent
	private LocalDateTime date;
	
	
	@NotNull
	private int employeeId;
}
