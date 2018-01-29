package com.mycompany.app;

public class Transaction {

    TxParams txParams;

    public Transaction(TxParams txParams){
        this.txParams = txParams;
    }

    public String viewTx(){
        System.out.println(txParams.getInput());
        System.out.println(txParams.getOutput());

        return txParams.getInput() + txParams.getOutput();
    }
}
