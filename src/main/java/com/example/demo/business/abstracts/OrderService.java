package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.order.CreateOrderRequest;
import com.example.demo.business.requests.order.UpdateOrderRequest;
import com.example.demo.business.responses.order.CreateOrderResponse;
import com.example.demo.business.responses.order.DeleteOrderResponse;
import com.example.demo.business.responses.order.GetAllOrdersResponse;
import com.example.demo.business.responses.order.GetOrderResponse;
import com.example.demo.business.responses.order.UpdateOrderResponse;
import com.example.demo.core.result.DataResult;

public interface OrderService {
	
	
	DataResult<CreateOrderResponse> add(CreateOrderRequest createOrderRequest);
	DataResult<List<GetAllOrdersResponse>> getAll();
	DataResult<GetOrderResponse> getById(int id);
	DataResult<DeleteOrderResponse> delete(int id);
	DataResult<UpdateOrderResponse> update (UpdateOrderRequest updateOrderRequest);
}
