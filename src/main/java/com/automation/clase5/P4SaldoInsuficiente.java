package com.automation.clase5;

public class P4SaldoInsuficiente extends RuntimeException {

    public P4SaldoInsuficiente(String message) {
        super(message);
    }

    public P4SaldoInsuficiente() {
        super("Error: Saldo insuficiente");
    }
}
