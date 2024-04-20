package com.example.phones_repair.service;

import com.example.phones_repair.dto.details.DetailOrderRequest;
import com.example.phones_repair.dto.details.DetailOrderResponse;

import java.util.List;

public interface DetailsService {
    void orderDetail(DetailOrderRequest orderRequest);
    void deleteOrder(Long id);

    List<DetailOrderResponse> showOrders();
}
