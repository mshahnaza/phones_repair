package com.example.phones_repair.repositories;

import com.example.phones_repair.dto.client.ClientResponse;
import com.example.phones_repair.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByOption(String option);
    Optional<Client> findTopByOrderByPriceDesc();
    Optional<Client> findTopByOrderByPriceAsc();
}
