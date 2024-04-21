package com.example.phones_repair.mapper;

import com.example.phones_repair.dto.order.ExecuteOrderResponse;
import com.example.phones_repair.entities.Order;

import java.util.List;

public interface OrderMapper {
    List<ExecuteOrderResponse> toDtoS(List<Order> all);
    ExecuteOrderResponse toDto(Order order);
}
