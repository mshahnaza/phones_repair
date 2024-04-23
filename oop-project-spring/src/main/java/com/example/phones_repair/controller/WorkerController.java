package com.example.phones_repair.controller;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;
import com.example.phones_repair.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/worker")
@AllArgsConstructor
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/showRepairOrders")
    public List<ClientResponse> showRepairOrders() {
        return workerService.showRepairOrders();
    }
    @GetMapping("/showReplaceOrders")
    public List<ClientResponse> showReplaceOrders() {
        return workerService.showReplaceOrders();
    }
    @GetMapping("/showServiceOrders")
    public List<ClientResponse> showServiceOrders() {
        return workerService.showServiceOrders();
    }
    @GetMapping("/showLargestOrder")
    public Optional<Client> showLargestOrder() {
        return workerService.showLargestOrder();
    }
    @GetMapping("/showSmallestOrder")
    public Optional<Client> showSmallestOrder() {
        return workerService.showSmallesttOrder();
    }
}
