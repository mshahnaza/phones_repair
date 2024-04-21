package com.example.phones_repair.mapper;

import com.example.phones_repair.dto.supplier.SupplierResponse;
import com.example.phones_repair.entities.Supplier;

import java.util.List;

public interface SupplierMapper {
    List<SupplierResponse> toDtoS(List<Supplier> all);
    SupplierResponse toDto(Supplier supplier);
}
