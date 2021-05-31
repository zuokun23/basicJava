package com.carlos.method_ref.instance_method;


public class V2 {
    public void printMsg(){
        System.out.println("This is instance method");
    }

    public static void main(String[] args) {
        new Thread(new V2()::printMsg).start();
    }
}
//This is instance method