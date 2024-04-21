package com.example.phones_repair.controller;

import com.example.phones_repair.dto.details.DetailOrderResponse;
import com.example.phones_repair.dto.supplier.SupplierRequest;
import com.example.phones_repair.dto.supplier.SupplierResponse;
import com.example.phones_repair.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@AllArgsConstructor
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @DeleteMapping("/makeDetailOrder")
    public void executeOrder(@RequestBody SupplierRequest orderRequest) {
        supplierService.executeOrder(orderRequest);
    }

    @GetMapping("showDetails")
    public List<DetailOrderResponse> showOrders() {
        return supplierService.showOrders();
    }

    @GetMapping("showDelivered")
    public List<SupplierResponse> showDelivered() {
        return supplierService.showDelivered();
    }
}
