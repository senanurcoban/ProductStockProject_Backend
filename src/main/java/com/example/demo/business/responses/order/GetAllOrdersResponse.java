package com.example.demo.business.responses.order;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllOrdersResponse {

	    private int id;
	    private LocalDateTime date;
	    private int employeeId;
}
