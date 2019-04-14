package com.vincentbartels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Receipt {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String instruction;


    public Receipt(String name, String instruction) {
        this.name = name;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public String getInstruction() {
        return instruction;
    }

    public long getId() {
        return id;
    }
}

