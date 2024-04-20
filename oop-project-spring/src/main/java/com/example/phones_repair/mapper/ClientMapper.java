package com.example.phones_repair.mapper;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;

import java.util.List;

public interface ClientMapper {
    List<ClientResponse> toDtoS(List<Client> all);
    ClientResponse toDto(Client client);
}
