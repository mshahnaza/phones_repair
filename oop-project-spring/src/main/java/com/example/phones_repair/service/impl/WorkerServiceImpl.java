package com.example.phones_repair.service.impl;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;
import com.example.phones_repair.mapper.ClientMapper;
import com.example.phones_repair.repositories.ClientRepository;
import com.example.phones_repair.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientResponse> showRepairOrders() {
        return clientMapper.toDtoS(clientRepository.findByOption("repair"));
    }
    @Override
    public List<ClientResponse> showReplaceOrders() {
        return clientMapper.toDtoS(clientRepository.findByOption("replace"));
    }
    @Override
    public List<ClientResponse> showServiceOrders() {
        return clientMapper.toDtoS(clientRepository.findByOption("clean"));
    }

    @Override
    public Optional<Client> showLargestOrder() {
        return clientRepository.findTopByOrderByPriceDesc();
    }

    @Override
    public Optional<Client> showSmallesttOrder() {
        return clientRepository.findTopByOrderByPriceAsc();
    }
}
