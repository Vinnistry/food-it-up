package com.vincentbartels.datamodel;

public class Receipt {

    private final long id;
    private final String name;
    private final String instruction;


    public Receipt(long id, String name, String instruction) {
        this.id = id;
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
