package com.example.demo.business.requests.order;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {

	private int id;
	private LocalDateTime date;
	private int employeeId;
}
