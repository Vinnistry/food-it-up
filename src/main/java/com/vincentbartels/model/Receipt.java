package com.vincentbartels.model;

import javax.persistence.*;

@Entity
@Table(name = "receipts")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "instruction")
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

    @Override
    public String toString() {
        return String.format("Receipt[id=%d, name='%s', instruction='%s']", id, name, instruction);
    }
}

