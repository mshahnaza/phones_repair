package com.example.phones_repair.service.impl;

import com.example.phones_repair.dto.client.ClientRequest;
import com.example.phones_repair.entities.Client;
import com.example.phones_repair.entities.Order;
import com.example.phones_repair.exception.CustomException;
import com.example.phones_repair.exception.ExceptionResponse;
import com.example.phones_repair.exception.NotFoundException;
import com.example.phones_repair.mapper.ClientMapper;
import com.example.phones_repair.mapper.OrderMapper;
import com.example.phones_repair.repositories.ClientRepository;
import com.example.phones_repair.repositories.OrderRepository;
import com.example.phones_repair.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(ClientRequest clientRequest) {
        Client client = new Client();
        client.setOption(clientRequest.getOption());
        client.setOption_subject(clientRequest.getOption_subject());
        if(client.getOption().equals("repair") && client.getOption_subject().equals("display")) {
            client.setPrice(50);
        }
        else if(client.getOption().equals("repair") && client.getOption_subject().equals("keyboard")) {
            client.setPrice(25);
        }
        else if(client.getOption().equals("repair") && client.getOption_subject().equals("motherboard")) {
            client.setPrice(40);
        }
        else if(client.getOption().equals("replace") && client.getOption_subject().equals("battery")) {
            client.setPrice(15);
        }
        else if(client.getOption().equals("replace") && client.getOption_subject().equals("display")) {
            client.setPrice(40);
        }
        else if(client.getOption().equals("replace") && client.getOption_subject().equals("processor")) {
            client.setPrice(40);
        }
        else if(client.getOption().equals("replace") && client.getOption_subject().equals("motherboard")) {
            client.setPrice(40);
        }
        else if(client.getOption().equals("replace") && client.getOption_subject().equals("RAM")) {
            client.setPrice(20);
        }
        else if(client.getOption().equals("clean") && client.getOption_subject().equals("dust")) {
            client.setPrice(5);
        }
        else if(client.getOption().equals("clean") && client.getOption_subject().equals("scratches")) {
            client.setPrice(10);
        }

        clientRepository.save(client);
    }

    @Override
    public Optional<Order> checkStatus(Long id) {
        if (!clientRepository.findById(id).isEmpty())
            throw new NotFoundException("Your phone is not ready yet!", HttpStatus.BAD_REQUEST);
        return orderRepository.findById(id);
    }
}
