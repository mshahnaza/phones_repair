package com.example.phones_repair.controller;

import com.example.phones_repair.dto.client.ClientRequest;
import com.example.phones_repair.entities.Order;
import com.example.phones_repair.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody ClientRequest clientRequest){
        clientService.addOrder(clientRequest);
    }

    @GetMapping("checkStatus")
    public void checkStatus(@RequestBody ClientRequest clientRequest) {
        clientService.checkStatus(clientRequest);
    }
}
