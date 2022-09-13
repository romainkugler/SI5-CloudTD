package com.polytech.si5.cloud.td.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClickCounterEntity {

    @Id
    @GeneratedValue
    private Long id;

    private int counter;

    public ClickCounterEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public ClickCounterEntity setCounter(int counter) {
        this.counter = counter;
        return this;
    }
}
