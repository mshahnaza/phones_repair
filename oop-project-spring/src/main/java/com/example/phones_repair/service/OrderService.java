package com.example.phones_repair.service;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.dto.order.MakeOrderRequest;

import java.util.List;

public interface OrderService {

    void makeRepair(MakeOrderRequest orderRequest);

    List<ClientResponse> showOrders();
}
