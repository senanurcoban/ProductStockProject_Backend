package com.example.demo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.OrderService;
import com.example.demo.business.requests.order.CreateOrderRequest;
import com.example.demo.business.requests.order.UpdateOrderRequest;
import com.example.demo.business.responses.order.CreateOrderResponse;
import com.example.demo.business.responses.order.DeleteOrderResponse;
import com.example.demo.business.responses.order.GetAllOrdersResponse;
import com.example.demo.business.responses.order.GetOrderResponse;
import com.example.demo.business.responses.order.UpdateOrderResponse;
import com.example.demo.core.mapping.ModelMapperService;
import com.example.demo.core.messages.BusinessMessage;
import com.example.demo.core.result.DataResult;
import com.example.demo.core.result.SuccessDataResult;
import com.example.demo.dataAccess.abstracts.OrderRepository;
import com.example.demo.entities.Order;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderManager implements OrderService{
	private ModelMapperService modelMapperService;
	private OrderRepository orderRepository;
	
	@Override
	public DataResult<CreateOrderResponse> add(CreateOrderRequest createOrderRequest) {
		Order order=this.modelMapperService.forRequest().map(createOrderRequest,Order.class);
		this.orderRepository.save(order);
		CreateOrderResponse createOrderResponse=this.modelMapperService.forResponse().map(order, CreateOrderResponse.class);
		return new SuccessDataResult<>(createOrderResponse, BusinessMessage.GlobalMessages.DATA_ADDED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<List<GetAllOrdersResponse>> getAll() {
		List<Order> orders=this.orderRepository.findAll();
		List<GetAllOrdersResponse> getAllOrderResponse=orders.stream().map(order -> this.modelMapperService.forResponse().map(order, GetAllOrdersResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<>(getAllOrderResponse, BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<GetOrderResponse> getById(int id) {
		 Order order = this.orderRepository.findById(id).get();
	     GetOrderResponse getAllOrderResponse= this.modelMapperService.forResponse().map(order, GetOrderResponse.class);
	     return new SuccessDataResult<>(getAllOrderResponse,BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<DeleteOrderResponse> delete(int id) {
		Order order = this.orderRepository.findById(id).get();
		DeleteOrderResponse deleteOrderResponse=this.modelMapperService.forResponse().map(order,DeleteOrderResponse.class);
		this.orderRepository.delete(order);
		return new SuccessDataResult<>(deleteOrderResponse,BusinessMessage.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<UpdateOrderResponse> update(UpdateOrderRequest updateOrderRequest) {
		 Order order = this.modelMapperService.forRequest().map(updateOrderRequest, Order.class);
	     this.orderRepository.save(order);
	     UpdateOrderResponse updateOrderResponse = this.modelMapperService.forResponse().map(order, UpdateOrderResponse.class);
		 return new SuccessDataResult<>(updateOrderResponse, BusinessMessage.GlobalMessages.DATA_UPDATED_SUCCESSFULLY);
	
	}
	
	
}
