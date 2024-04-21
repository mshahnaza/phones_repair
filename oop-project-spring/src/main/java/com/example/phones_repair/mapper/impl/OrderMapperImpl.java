package com.example.phones_repair.mapper.impl;

import com.example.phones_repair.dto.order.ExecuteOrderResponse;
import com.example.phones_repair.entities.Order;
import com.example.phones_repair.mapper.OrderMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public List<ExecuteOrderResponse> toDtoS(List<Order> all) {
        List<ExecuteOrderResponse> orderResponses = new ArrayList<>();
        for (Order order: all){
            orderResponses.add(toDto(order));
        }
        return orderResponses;
    }

    @Override
    public ExecuteOrderResponse toDto(Order order) {
        ExecuteOrderResponse orderResponse = new ExecuteOrderResponse();
        orderResponse.setId(order.getId());
        orderResponse.setClient_id(order.getClient_id());
        orderResponse.setOrder(order.getOrder_name());
        return orderResponse;
    }
}
