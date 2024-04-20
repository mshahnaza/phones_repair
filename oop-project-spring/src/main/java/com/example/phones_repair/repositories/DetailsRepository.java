package com.example.phones_repair.repositories;

import com.example.phones_repair.entities.Details;
import com.example.phones_repair.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
}
