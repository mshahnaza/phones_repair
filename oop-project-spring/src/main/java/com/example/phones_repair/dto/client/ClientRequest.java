package com.example.phones_repair.dto.client;

public class ClientRequest {
    private String option;

    private String option_subject;

    private Integer price;

    private Long my_id;

    public Long getMy_id() {
        return my_id;
    }

    public void setMy_id(Long my_id) {
        this.my_id = my_id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOption_subject() {
        return option_subject;
    }

    public void setOption_subject(String option_subject) {
        this.option_subject = option_subject;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
