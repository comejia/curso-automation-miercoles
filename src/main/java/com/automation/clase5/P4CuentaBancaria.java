package com.automation.clase5;

public class P4CuentaBancaria {

    private int saldo;

    public P4CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean tieneSaldo() {
        return saldo > 0;
    }

    public void transferir(int monto) {
        if (monto > saldo) {
            throw new P4SaldoInsuficiente();
        }
        System.out.println("Realizando una transferencia.");
    }
}
