package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenkeyHandlerTest {

    @Test
    public void checkPubKeyBytes(){
        GenkeyHandler test1 = new GenkeyHandler();
        String a = test1.toString();
        assertTrue(a.length() < 100000);
    }

}