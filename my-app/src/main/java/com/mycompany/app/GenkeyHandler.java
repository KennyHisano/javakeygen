package com.mycompany.app;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class GenkeyHandler {
    GenerateKeys generateKeys;

    public GenkeyHandler(){
        try {
            generateKeys = new GenerateKeys();
            generateKeys.createKeys();
            generateKeys.showKey();
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            System.err.println(e.getMessage());
        }

    }



}
