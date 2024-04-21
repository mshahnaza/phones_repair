package com.example.phones_repair.service;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.dto.order.ExecuteOrderRequest;

import java.util.List;

public interface OrderService {

    void executeOrder(ExecuteOrderRequest orderRequest);

    List<ClientResponse> showOrders();
}
