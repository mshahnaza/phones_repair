package com.example.phones_repair.service;

import com.example.phones_repair.dto.client.ClientRequest;
import com.example.phones_repair.entities.Order;

import java.util.Optional;

public interface ClientService {
    void addOrder(ClientRequest clientRequest);
    void checkStatus(ClientRequest clientRequest);
}
