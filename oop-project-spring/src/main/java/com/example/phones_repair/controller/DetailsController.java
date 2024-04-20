package com.example.phones_repair.controller;

import com.example.phones_repair.dto.details.DetailOrderRequest;
import com.example.phones_repair.dto.details.DetailOrderResponse;
import com.example.phones_repair.service.DetailsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repairman")
@AllArgsConstructor
public class DetailsController {
    private DetailsService detailsService;

    @PostMapping("/orderDetail")
    public void orderDetail(@RequestBody DetailOrderRequest orderRequest) {
        detailsService.orderDetail(orderRequest);
    }

    @DeleteMapping("deleteOrder/{id}")
    public void deleteOrder(@PathVariable Long id) {
        detailsService.deleteOrder(id);
    }

    @GetMapping("showDetails")
    public List<DetailOrderResponse> showOrders() {
        return detailsService.showOrders();
    }
}
