package com.example.phones_repair.controller;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.dto.order.ExecuteOrderRequest;
import com.example.phones_repair.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repairman")
@AllArgsConstructor
public class OrderController {
    @Autowired
    private OrderService orderService;

    @DeleteMapping("/executeOrder")
    public void executeOrder(@RequestBody ExecuteOrderRequest orderRequest) {
        orderService.executeOrder(orderRequest);
    }

    @GetMapping("/showOrders")
    public List<ClientResponse> showOrders(){
        return orderService.showOrders();
    }
}
