package com.example.phones_repair.mapper.impl;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;
import com.example.phones_repair.mapper.ClientMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientMapperImpl implements ClientMapper {
    @Override
    public List<ClientResponse> toDtoS(List<Client> all) {
        List<ClientResponse> clientResponses = new ArrayList<>();
        for (Client client: all){
            clientResponses.add(toDto(client));
        }
        return clientResponses;
    }

    @Override
    public ClientResponse toDto(Client client) {
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setId(client.getId());
        clientResponse.setOption(client.getOption());
        clientResponse.setOption_subject(client.getOption_subject());
        clientResponse.setPrice(client.getPrice());
        return clientResponse;
    }
}
