package com.example.phones_repair.service.impl;

import com.example.phones_repair.dto.details.DetailOrderRequest;
import com.example.phones_repair.dto.details.DetailOrderResponse;
import com.example.phones_repair.entities.Details;
import com.example.phones_repair.exception.NotFoundException;
import com.example.phones_repair.mapper.DetailsMapper;
import com.example.phones_repair.repositories.DetailsRepository;
import com.example.phones_repair.service.DetailsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailsServiceImpl implements DetailsService {
    @Autowired
    private DetailsRepository detailsRepository;

    @Autowired
    private DetailsMapper detailsMapper;

    @Override
    public void orderDetail(DetailOrderRequest orderRequest) {
        Details details = new Details();
        details.setDetail_name(orderRequest.getDetail_name());
        detailsRepository.save(details);
    }

    @Override
    public void deleteOrder(Long id) {
        if (detailsRepository.findById(id).isEmpty())
            throw new NotFoundException("The detail with id: "+id+" is empty!", HttpStatus.BAD_REQUEST);
        detailsRepository.deleteById(id);
    }

    @Override
    public List<DetailOrderResponse> showOrders() {
        return detailsMapper.toDtoS(detailsRepository.findAll());
    }
}
