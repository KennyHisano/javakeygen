package com.mycompany.app;

public class TxParams {

    public String input;
    public String output;

    public TxParams(){
    }

    public TxParams(String input, String output){
        this.input = input;
        this.output = output;
    }


    public String getInput(){
        return input;
    }

    public void setInput(){
        this.input = input;
    }

    public String getOutput(){
        return output;
    }

    public void setOutput(){
        this.output = output;
    }
}