package com.example.phones_repair.service.impl;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.dto.order.ExecuteOrderRequest;
import com.example.phones_repair.entities.Order;
import com.example.phones_repair.exception.NotFoundException;
import com.example.phones_repair.mapper.ClientMapper;
import com.example.phones_repair.repositories.ClientRepository;
import com.example.phones_repair.repositories.OrderRepository;
import com.example.phones_repair.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void executeOrder(ExecuteOrderRequest orderRequest) {
        Order order = new Order();
        order.setClient_id(orderRequest.getClient_id());
        order.setOrder_name(orderRequest.getOrder_name());
        orderRepository.save(order);
        if (clientRepository.findById(orderRequest.getClient_id()).isEmpty())
            throw new NotFoundException("the product with id: "+ orderRequest.getClient_id() +" is empty!", HttpStatus.BAD_REQUEST);
        clientRepository.deleteById(orderRequest.getClient_id());
    }

    @Override
    public List<ClientResponse> showOrders() {
        return clientMapper.toDtoS(clientRepository.findAll());
    }
}
