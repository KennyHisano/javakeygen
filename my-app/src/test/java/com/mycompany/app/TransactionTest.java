package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

   // public void viewTx() {
    //}
    @Test
    public void checkAddLength(){
        TxParams a = new TxParams("1LQbdKmc4X6L1RugCw63AwhMnT9LxpnE1d","1GLHSipsWoMTkDYpfaGb7ZpNEqbJqzuGAx");
        String i = a.getInput();
        String o = a.getOutput();
        int length = 34;
        assertTrue(o.length() == length);
        assertTrue(i.length() == length);
    }
}