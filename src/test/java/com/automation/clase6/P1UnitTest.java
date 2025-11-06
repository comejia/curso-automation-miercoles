package com.automation.clase6;

import com.automation.clase5.P4CuentaBancaria;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P1UnitTest {

    @Test
    public void testTieneSaldo() {
        P4CuentaBancaria cuenta = new P4CuentaBancaria(15);

        Assert.assertTrue(cuenta.tieneSaldo(), "La cuenta no tiene saldo");
    }

    @Test
    public void testNoTieneSaldo() {
        P4CuentaBancaria cuenta = new P4CuentaBancaria(0);

        Assert.assertFalse(cuenta.tieneSaldo(), "La cuenta tiene saldo");
    }
}
