package com.example.phones_repair.service.impl;

import com.example.phones_repair.dto.details.DetailOrderResponse;
import com.example.phones_repair.dto.supplier.SupplierRequest;
import com.example.phones_repair.dto.supplier.SupplierResponse;
import com.example.phones_repair.entities.Supplier;
import com.example.phones_repair.exception.NotFoundException;
import com.example.phones_repair.mapper.DetailsMapper;
import com.example.phones_repair.mapper.SupplierMapper;
import com.example.phones_repair.repositories.DetailsRepository;
import com.example.phones_repair.repositories.SupplierRepository;
import com.example.phones_repair.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private DetailsRepository detailsRepository;
    @Autowired
    private DetailsMapper detailsMapper;
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public void executeOrder(SupplierRequest supplierRequest) {
        Supplier supplier = new Supplier();
        supplier.setOrder_id(supplierRequest.getOrder_id());
        supplier.setDetail_name(supplierRequest.getDetail_name());
        supplierRepository.save(supplier);
        if (detailsRepository.findById(supplierRequest.getOrder_id()).isEmpty())
            throw new NotFoundException("the product with id: "+ supplierRequest.getOrder_id() +" is empty!", HttpStatus.BAD_REQUEST);
        detailsRepository.deleteById(supplierRequest.getOrder_id());
    }

    @Override
    public List<DetailOrderResponse> showOrders() {
        return detailsMapper.toDtoS(detailsRepository.findAll());
    }

    @Override
    public List<SupplierResponse> showDelivered() {
        return supplierMapper.toDtoS(supplierRepository.findAll());
    }
}
