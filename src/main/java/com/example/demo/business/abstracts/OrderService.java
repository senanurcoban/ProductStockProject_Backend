package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.order.CreateOrderRequest;
import com.example.demo.business.requests.order.DeleteOrderRequest;
import com.example.demo.business.requests.order.UpdateOrderRequest;
import com.example.demo.business.responses.order.CreateOrderResponse;
import com.example.demo.business.responses.order.DeleteOrderResponse;
import com.example.demo.business.responses.order.GetAllOrdersResponse;
import com.example.demo.business.responses.order.GetOrderResponse;
import com.example.demo.business.responses.order.UpdateOrderResponse;

public interface OrderService {

	List<GetAllOrdersResponse> getAll();
	CreateOrderResponse add(CreateOrderRequest createOrderRequest);
	GetOrderResponse getById(int id);
	DeleteOrderResponse deleteOrder(DeleteOrderRequest deleteOrderRequest);
	UpdateOrderResponse updateOrder(UpdateOrderRequest updateOrderRequest);
}
