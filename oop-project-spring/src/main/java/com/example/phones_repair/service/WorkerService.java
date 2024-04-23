package com.example.phones_repair.service;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;

import java.util.List;
import java.util.Optional;

public interface WorkerService {
    List<ClientResponse> showRepairOrders();
    List<ClientResponse> showReplaceOrders();
    List<ClientResponse> showServiceOrders();
    Optional<Client> showLargestOrder();
    Optional<Client> showSmallesttOrder();
}
