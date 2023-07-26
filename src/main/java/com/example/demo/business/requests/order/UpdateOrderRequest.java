package com.example.demo.business.requests.order;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {

	@NotEmpty
	@NotNull
	private int id;
	
	@FutureOrPresent
	private LocalDateTime date;
	
	@NotEmpty
	@NotNull
	private int employeeId;
}
