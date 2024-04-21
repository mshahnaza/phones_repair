package com.example.phones_repair.mapper.impl;

import com.example.phones_repair.dto.supplier.SupplierResponse;
import com.example.phones_repair.entities.Supplier;
import com.example.phones_repair.mapper.SupplierMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SupplierMapperImpl implements SupplierMapper {
    @Override
    public List<SupplierResponse> toDtoS(List<Supplier> all) {
        List<SupplierResponse> supplierResponses = new ArrayList<>();
        for (Supplier supplier: all){
            supplierResponses.add(toDto(supplier));
        }
        return supplierResponses;
    }

    @Override
    public SupplierResponse toDto(Supplier supplier) {
        SupplierResponse supplierResponse = new SupplierResponse();
        supplierResponse.setId(supplier.getId());
        supplierResponse.setDetail_name(supplier.getDetail_name());
        supplierResponse.setOrder_id(supplier.getOrder_id());
        supplierResponse.setDate(supplier.getDate());
        return supplierResponse;
    }
}
