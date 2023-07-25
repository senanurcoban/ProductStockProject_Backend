package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.OrderService;
import com.example.demo.business.requests.order.CreateOrderRequest;
import com.example.demo.business.requests.order.UpdateOrderRequest;
import com.example.demo.business.responses.order.CreateOrderResponse;
import com.example.demo.business.responses.order.DeleteOrderResponse;
import com.example.demo.business.responses.order.GetAllOrdersResponse;
import com.example.demo.business.responses.order.GetOrderResponse;
import com.example.demo.business.responses.order.UpdateOrderResponse;
import com.example.demo.core.result.DataResult;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {

	private OrderService orderService;
	@GetMapping("/getall")
	public  DataResult<List<GetAllOrdersResponse>> getAll(){
		return orderService.getAll();
	}
	
	@PostMapping("/add")
	public  DataResult<CreateOrderResponse> add(@RequestBody() CreateOrderRequest createOrderRequest) {
		return this.orderService.add(createOrderRequest);
	}
    @GetMapping("/getbyid")
    public  DataResult<GetOrderResponse> getById(int id){
    	 return orderService.getById(id);
    } 
    @DeleteMapping("/delete")
	public  DataResult<DeleteOrderResponse> delete(int id) {
		return orderService.delete(id);
	}
	@PutMapping("/update")
	public DataResult<UpdateOrderResponse> update(@RequestBody UpdateOrderRequest updateOrderRequest) {
		return orderService.update(updateOrderRequest);
	}
}
