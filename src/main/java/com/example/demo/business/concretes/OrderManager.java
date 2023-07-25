package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

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

@Service
@AllArgsConstructor
public class OrderManager implements OrderService{
	@Override
	public DataResult<CreateOrderResponse> add(CreateOrderRequest createOrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<GetAllOrdersResponse>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<GetOrderResponse> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<DeleteOrderResponse> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<UpdateOrderResponse> update(UpdateOrderRequest updateOrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
