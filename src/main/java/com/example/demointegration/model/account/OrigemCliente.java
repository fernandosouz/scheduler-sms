package com.example.demointegration.model.account;

public class OrigemCliente {

    private Number Value;

    public OrigemCliente(){};

    public OrigemCliente(Number value) {
        Value = value;
    }

    public Number getValue() {
        return Value;
    }

    public void setValue(Number value) {
        Value = value;
    }
}
