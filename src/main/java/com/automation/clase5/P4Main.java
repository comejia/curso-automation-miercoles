package com.automation.clase5;

public class P4Main {

    public static void main(String[] args) {

        P4CuentaBancaria cuentaBancaria = new P4CuentaBancaria(50);

        try {
            cuentaBancaria.transferir(100);
        } catch (P4SaldoInsuficiente e) {
            var saldo = cuentaBancaria.getSaldo();
            cuentaBancaria.transferir(saldo);
        }
    }
}
