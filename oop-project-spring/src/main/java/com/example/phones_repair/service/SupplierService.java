package com.example.phones_repair.service;

import com.example.phones_repair.dto.details.DetailOrderResponse;
import com.example.phones_repair.dto.supplier.SupplierRequest;
import com.example.phones_repair.dto.supplier.SupplierResponse;

import java.util.List;

public interface SupplierService {
    void executeOrder(SupplierRequest supplierRequest);
    List<DetailOrderResponse> showOrders();
    List<SupplierResponse> showDelivered();
}
