package com.mycompany.app;


public class App 
{
    public static void main( String[] args )
    {

        TxParams a = new TxParams("3Q3G7idZ44XcZ4oVPddJ1kfGr44vDHhsRM","351jXCCsxFh1k9bmrRLAeQutBUf3PAu21X");
        Transaction tx1 = new Transaction(a);
        tx1.viewTx();


        GenkeyHandler cli1 = new GenkeyHandler();
        GenkeyHandler cli2 = new GenkeyHandler();
    }
}
