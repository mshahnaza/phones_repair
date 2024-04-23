package com.example.phones_repair.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "orders_table")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String option;

    private String option_subject;

    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
