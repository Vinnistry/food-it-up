package com.vincentbartels.model;

import javax.persistence.*;

@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String instruction;

    protected Receipt() {

    }

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

