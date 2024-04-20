package com.example.phones_repair.dto.order;

public class MakeOrderResponse {
    private Long id;

    private Long client_id;

    private String order_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder(String order_name) {
        this.order_name = order_name;
    }
}
